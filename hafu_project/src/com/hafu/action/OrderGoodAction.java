package com.hafu.action;

import org.apache.struts2.ServletActionContext;

import com.hafu.domain.HafuOrderGoodComment;
import com.hafu.service.HafuOrderGoodService;
import com.hafu.service.HafuOrderService;
import com.hafu.vo.OrderGoodPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OrderGoodAction extends ActionSupport implements ModelDriven<HafuOrderGoodComment>{
	private int currentPage = 1;
	private int pageSize = 20;
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

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public String search(int orderid) {
		OrderGoodPage orderGoodPage = hafuOrderService.findOrderGoodByOrderId(orderid, currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("orderGoodPage", orderGoodPage);
		return SUCCESS;
	}
}
