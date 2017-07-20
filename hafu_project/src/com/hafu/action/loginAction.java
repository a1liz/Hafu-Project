package com.hafu.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hafu.domain.HafuUserComment;
import com.hafu.util.DBUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class loginAction extends ActionSupport implements ModelDriven<HafuUserComment>{
	private HafuUserComment user = new HafuUserComment();

	@Override
	public HafuUserComment getModel() {
		return user;
	}
	
	public HafuUserComment getUser() {
		return user;
	}

	public void setUser(HafuUserComment user) {
		this.user = user;
	}
	
	public String execute() {
		System.out.println("登录中");
		String sql = "select * from user where username=? and password=?";
		DBUtil db = new DBUtil();
		ResultSet rs = db.execQuery(sql, new Object[]{user.getUsername(),user.getPassword()});
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