package com.hafu.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hafu.domain.HafuUserComment;
import com.hafu.util.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.bcel.internal.generic.NEW;


public class SignupAction extends ActionSupport implements ModelDriven<HafuUserComment>{
	private HafuUserComment hafu_user_comment = new HafuUserComment();

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

	}
		
	