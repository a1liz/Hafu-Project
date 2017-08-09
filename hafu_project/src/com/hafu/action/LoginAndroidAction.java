package com.hafu.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hafu.domain.HafuCheckoutComment;
import com.hafu.domain.HafuUserComment;
import com.hafu.service.HafuCheckoutService;
import com.hafu.service.impl.HafuCheckoutServiceImpl;
import com.hafu.util.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAndroidAction extends ActionSupport implements ModelDriven<HafuUserComment>,ServletResponseAware,ServletRequestAware{
	private HafuUserComment hafu_user_comment = new HafuUserComment();
	private HafuCheckoutService hafuCheckoutService;
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
	
	public String execute() {
		response.setCharacterEncoding("utf-8");
		String name = (String) request.getParameter("id");
		String pwd = (String) request.getParameter("pwd");
		String string;
		System.out.println(name + pwd);
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery("from HafuUserComment where username = ? and password = ?");
		query.setString(0, name);
		query.setString(1, pwd);
		List<HafuUserComment> list = query.list();
		tran.commit();
		if(!list.isEmpty()) {
			query = session.createQuery("from HafuCheckoutComment where uid = ?");
			query.setInteger(0, list.get(0).getUid());
			List<HafuCheckoutComment> list2 = query.list();
			if(list2.isEmpty()) {
				HafuCheckoutComment hafuCheckoutComment = new HafuCheckoutComment();
				hafuCheckoutComment.setUid(list.get(0).getUid());
				hafuCheckoutService.add(hafuCheckoutComment);
			}
			HafuCheckoutComment hafuCheckoutComment = hafuCheckoutService.findOrderByUserId(list.get(0).getUid());
			string = JSON.toJSONString(hafuCheckoutComment.getUid());
			//ServletActionContext.getRequest().getSession().setAttribute("hafuCheckoutComment", hafuCheckoutComment);
		} else {
			string = "FALSE";
		}
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
}