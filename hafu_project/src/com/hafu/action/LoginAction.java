package com.hafu.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hafu.domain.HafuCheckoutComment;
import com.hafu.domain.HafuUserComment;
import com.hafu.service.HafuCheckoutService;
import com.hafu.service.impl.HafuCheckoutServiceImpl;
import com.hafu.util.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<HafuUserComment>{
	private HafuUserComment hafu_user_comment = new HafuUserComment();
	
	private HafuCheckoutService hafuCheckoutService;

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
				hafuCheckoutComment.setUid(list.get(0).getUid());
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

	public HafuCheckoutService getHafuCheckoutService() {
		return hafuCheckoutService;
	}

	public void setHafuCheckoutService(HafuCheckoutService hafuCheckoutService) {
		this.hafuCheckoutService = hafuCheckoutService;
	}
}