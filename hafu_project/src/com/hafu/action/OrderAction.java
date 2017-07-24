package com.hafu.action;

import com.hafu.domain.HafuOrderComment;
import com.hafu.service.HafuOrderService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OrderAction extends ActionSupport implements ModelDriven<HafuOrderComment>{
	private HafuOrderComment hafuOrderComment = new HafuOrderComment();
	private HafuOrderService hafuOrderService;

	@Override
	public HafuOrderComment getModel() {
		// TODO Auto-generated method stub
		return hafuOrderComment;
	}
	
	public String add() {
		hafuOrderService.add(hafuOrderComment);
		return SUCCESS;
	}
	
}
