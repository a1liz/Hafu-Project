package com.hafu.action;

import com.hafu.domain.HafuOrderGoodComment;
import com.hafu.service.HafuOrderGoodService;
import com.hafu.service.HafuOrderService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OrderGoodAction extends ActionSupport implements ModelDriven<HafuOrderGoodComment>{
	private HafuOrderGoodComment hafuOrderGoddComment = new HafuOrderGoodComment();
	private HafuOrderGoodService hafuOrderService;
	
	@Override
	public HafuOrderGoodComment getModel() {
		// TODO Auto-generated method stub
		return hafuOrderGoddComment;
	}
	
	public String add() {
		hafuOrderService.add(hafuOrderGoddComment);
		return SUCCESS;
	}
	
}
