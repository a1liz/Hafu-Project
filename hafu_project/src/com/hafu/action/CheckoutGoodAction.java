package com.hafu.action;

import org.apache.struts2.ServletActionContext;

import com.hafu.domain.HafuCheckoutGoodComment;
import com.hafu.service.HafuCheckoutGoodService;
import com.hafu.vo.CheckoutGoodPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CheckoutGoodAction extends ActionSupport implements ModelDriven<HafuCheckoutGoodComment>{
	private int currentPage = 1;
	private int pageSize = 20;
	private HafuCheckoutGoodComment hafuCheckoutGoodComment = new HafuCheckoutGoodComment();
	private HafuCheckoutGoodService hafuCheckoutGoodService;
	
	@Override
	public HafuCheckoutGoodComment getModel() {
		// TODO Auto-generated method stub
		return hafuCheckoutGoodComment;
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
	
	public String add() {
		hafuCheckoutGoodService.add(hafuCheckoutGoodComment);
		return SUCCESS;
	}
	
	public String search(int cid) {
		CheckoutGoodPage checkoutGoodPage = hafuCheckoutGoodService.findCheckoutGoodByCheckoutId(cid, currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("checkoutGoodPage", checkoutGoodPage);
		return SUCCESS;
	}
}
