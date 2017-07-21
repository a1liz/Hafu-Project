package com.hafu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	//三属性四方法
	private Connection conn = null;
	private PreparedStatement  ptsm = null;
	private ResultSet rs =null;
	//方法一：获取数据库连接
	public void getConn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc:mysql://127.0.0.1:3306/test";
			String username ="root";
			String password = "1";
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//方法二：关闭数据库连接的方法
	public void closeConn(){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ptsm!=null){
			try {
				ptsm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//方法三：增删改的方法
	public int executOther(final String strSQL,final Object[] params){
		this.getConn();
		try {
			ptsm = conn.prepareStatement(strSQL);
			for(int i=0;i<params.length;i++){
				ptsm.setObject(i+1, params[i]);
			}
			return ptsm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -1;
	}
	//方法四：专门执行查询的方法
	public ResultSet execQuery(final String strSQL,final Object[] params){
		this.getConn();
		try {
			ptsm = conn.prepareStatement(strSQL);
			for(int i=0;i<params.length;i++){
				ptsm.setObject(i+1, params[i]);
			}
			return ptsm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
