package com.hafu.action;

import org.apache.struts2.ServletActionContext;

import com.hafu.domain.HafuStoreComment;
import com.hafu.service.HafuStoreService;
import com.hafu.vo.StorePage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StoreAction extends ActionSupport implements ModelDriven<HafuStoreComment>{
	private int currentPage = 1;
	private int pageSize = 20;
	private HafuStoreComment hafuStoreComment = new HafuStoreComment();
	private HafuStoreService hafuStoreService;
	@Override
	public HafuStoreComment getModel() {
		// TODO Auto-generated method stub
		return hafuStoreComment;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String search() {
		StorePage storePage = hafuStoreService.findAllStore(currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("storePage", storePage);
		return SUCCESS;
	}
}
