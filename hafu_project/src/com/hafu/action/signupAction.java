package com.hafu.action;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hafu.domain.HafuUserComment;
import com.hafu.util.DBUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class signupAction extends ActionSupport implements ModelDriven<HafuUserComment>{
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
		String sql = "select * from hafu_user_comment where username=?";
		DBUtil db = new DBUtil();
		ResultSet rs = db.execQuery(sql, new Object[]{hafu_user_comment.getUsername()});
		try {
			if(rs.next()){
				this.addActionError("用户名已存在");
				return "fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql2 = "insert into hafu_user_comment values(null, ?, ?)";
		int rs2 = db.executOther(sql2, new Object[]{hafu_user_comment.getUsername(), hafu_user_comment.getPassword()});
		db.closeConn();
		if (rs2 > 0) {
			return SUCCESS;
		} else {
			return null;
		}
	}

	}
		
	