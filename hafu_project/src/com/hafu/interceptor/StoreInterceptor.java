package com.hafu.interceptor;

import org.apache.struts2.ServletActionContext;

import com.hafu.action.StoreAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class StoreInterceptor extends MethodFilterInterceptor{
	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (username == null) {
			StoreAction action = (StoreAction) arg0.getAction();
			action.addActionError("权限不足，请先登录！");
			return "fail";
		}
		return "null";
	}
}
