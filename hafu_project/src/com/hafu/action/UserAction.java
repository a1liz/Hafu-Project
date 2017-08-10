package com.hafu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hafu.domain.HafuCheckoutComment;
import com.hafu.domain.HafuUserComment;
import com.hafu.domain.HafuUserProfileComment;
import com.hafu.service.HafuCheckoutService;
import com.hafu.service.HafuUserProfileService;
import com.hafu.util.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<HafuUserComment>,ServletResponseAware,ServletRequestAware{
	private HafuUserComment hafu_user_comment = new HafuUserComment();
	private HafuCheckoutService hafuCheckoutService;
	private HafuUserProfileService hafuUserProfileService;
	
	private HttpServletRequest request;
	private HttpServletResponse response;

	@Override
	public HafuUserComment getModel() {
		return hafu_user_comment;
	}
	
	public HafuUserComment getUser() {
		return hafu_user_comment;
	}

	public void setUser(HafuUserComment hafu_user_comment) {
		this.hafu_user_comment = hafu_user_comment;
	}
	
	public String login() {
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery("from HafuUserComment where username = ? and password = ?");
		query.setString(0, hafu_user_comment.getUsername());
		query.setString(1, hafu_user_comment.getPassword());
		List<HafuUserComment> list = query.list();
		tran.commit();
		if(!list.isEmpty()) {
			query = session.createQuery("from HafuCheckoutComment where uid = ?");
			query.setInteger(0, list.get(0).getUid());
			List<HafuCheckoutComment> list2 = query.list();
			if(list2.isEmpty()) {
				HafuCheckoutComment hafuCheckoutComment = new HafuCheckoutComment();
				hafuCheckoutComment.setHafuUserComment(list.get(0));
				hafuCheckoutService.add(hafuCheckoutComment);
			}
			HafuCheckoutComment hafuCheckoutComment = hafuCheckoutService.findOrderByUserId(list.get(0).getUid());
			ServletActionContext.getRequest().getSession().setAttribute("hafuCheckoutComment", hafuCheckoutComment);
			session.close();
			return SUCCESS;
		}
		else {
			this.addActionError("用户名或密码错误！");
			session.close();
			return "fail";
		}
	}
	
	public String loginAndroid() {
		response.setCharacterEncoding("utf-8");
		String name = (String) request.getParameter("id");
		String pwd = (String) request.getParameter("pwd");
		String string;
		System.out.println(name + pwd);
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery("from HafuUserComment where username = ? and password = ? or regphone = ? and password = ?");
		query.setString(0, name);
		query.setString(1, pwd);
		query.setString(2, name);
		query.setString(3, pwd);
		List<HafuUserComment> list = query.list();
		if(!list.isEmpty()) {
			query = session.createQuery("from HafuCheckoutComment where uid = ?");
			query.setInteger(0, list.get(0).getUid());
			List<HafuCheckoutComment> list2 = query.list();
			if(list2.isEmpty()) {
				HafuCheckoutComment hafuCheckoutComment = new HafuCheckoutComment();
				hafuCheckoutComment.setHafuUserComment(list.get(0));
				hafuCheckoutService.add(hafuCheckoutComment);
			}
			HafuCheckoutComment hafuCheckoutComment = hafuCheckoutService.findOrderByUserId(list.get(0).getUid());
			//string = JSON.toJSONString(hafuCheckoutComment.getHafuUserComment().getUid());
			JSONArray jsonArray = new JSONArray();
			jsonArray.add("TRUE");
			jsonArray.add(list.get(0));
			string = jsonArray.toJSONString();
			//ServletActionContext.getRequest().getSession().setAttribute("hafuCheckoutComment", hafuCheckoutComment);
		} else {
			JSONArray jsonArray = new JSONArray();
			jsonArray.add("FALSE");
			string = jsonArray.toJSONString();		
		}
		tran.commit();
		session.close();
		try {
			PrintWriter out = response.getWriter();
			out.print(string);
			out.flush();
			out.close();
			System.out.print(string+"登录成功");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String register() {
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery("from HafuUserComment where username = ?");
		query.setString(0, hafu_user_comment.getUsername());
		if(!query.list().isEmpty()) {
			this.addActionError("用户名已存在");
			tran.commit();
			session.close();
			return "fail";
		} else if(hafu_user_comment.getUsername() == null) {
			tran.commit();
			session.close();
			return "fail";
		}
		else {
			session.save(hafu_user_comment);
			tran.commit();
			session.close();
			return SUCCESS;
		}
	}
	
	public String registerAndroid() {
		response.setCharacterEncoding("utf-8");
		String name = (String) request.getParameter("id");
		String pwd = (String) request.getParameter("pwd");
		String regphone = (String) request.getParameter("regphone");
		hafu_user_comment.setUsername(name);
		hafu_user_comment.setPassword(pwd);
		hafu_user_comment.setRegphone(regphone);
		String string;
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery("from HafuUserComment where username = ?");
		query.setString(0, hafu_user_comment.getUsername());
		if(!query.list().isEmpty()) {
			string = "FALSE";
		} else {
			session.save(hafu_user_comment);
			string = "TRUE";
		}
		tran.commit();
		session.close();
		try {
			PrintWriter out = response.getWriter();
			out.print(string);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String getAddress() {
		response.setCharacterEncoding("utf-8");
		String uid = (String) request.getParameter("uid");
		
		List<HafuUserProfileComment> list = hafuUserProfileService.findUserProfileByUserId(Integer.parseInt(uid));
		
		String string;
		JSONArray jsonArray = new JSONArray();
		if (!list.isEmpty()) {
			jsonArray.add("TRUE");
			for (HafuUserProfileComment hafuUserProfileComment : list) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("name", hafuUserProfileComment.getName());
				jsonObject.put("pid", hafuUserProfileComment.getPid());
				jsonObject.put("phone", hafuUserProfileComment.getPhone());
				jsonObject.put("address", hafuUserProfileComment.getUserAddress());
				jsonArray.add(jsonObject);
			}
		} else {
			jsonArray.add("FALSE");
		}
		string = jsonArray.toJSONString();
		try {
			PrintWriter out = response.getWriter();
			out.print(string);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public HafuCheckoutService getHafuCheckoutService() {
		return hafuCheckoutService;
	}

	public void setHafuCheckoutService(HafuCheckoutService hafuCheckoutService) {
		this.hafuCheckoutService = hafuCheckoutService;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}
	
	public HafuUserProfileService getHafuUserProfileService() {
		return hafuUserProfileService;
	}

	public void setHafuUserProfileService(HafuUserProfileService hafuUserProfileService) {
		this.hafuUserProfileService = hafuUserProfileService;
	}

}
