package com.hafu.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hafu.domain.HafuUserComment;
import com.hafu.util.DBUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class loginAction extends ActionSupport implements ModelDriven<HafuUserComment>{
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
		System.out.println("登录中");
		String sql = "select * from hafu_user_comment where username=? and password=?";
		DBUtil db = new DBUtil();
		ResultSet rs = db.execQuery(sql, new Object[]{hafu_user_comment.getUsername(),hafu_user_comment.getPassword()});
		try {
			if(rs.next()){
				return SUCCESS;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.addActionError("用户名不存在或密码错误");
		return "fail";
	}
}