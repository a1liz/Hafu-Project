package com.hafu.action;

import org.apache.struts2.ServletActionContext;

import com.hafu.domain.HafuGoodComment;
import com.hafu.service.HafuGoodService;
import com.hafu.vo.GoodPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GoodAction extends ActionSupport implements ModelDriven<HafuGoodComment> {
	private int currentPage = 1;
	private int pageSize = 20;
	private HafuGoodComment hafuGoodComment = new HafuGoodComment();
	private HafuGoodService hafuGoodService;
	
	public HafuGoodService getHafuGoodService() {
		return hafuGoodService;
	}
	public void setHafuGoodService(HafuGoodService hafuGoodService) {
		this.hafuGoodService = hafuGoodService;
	}
	@Override
	public HafuGoodComment getModel() {
		// TODO Auto-generated method stub
		return hafuGoodComment;
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
	
	public String search() {
		int sid = 1;
		String tmp = ServletActionContext.getRequest().getParameter("sid");
		if (tmp != null) {
			sid = Integer.parseInt(tmp);
		}
		GoodPage goodPage = hafuGoodService.findGoodByStoreId(sid, currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("goodPage", goodPage);
		return SUCCESS;
	}
	
	public String searchGoodDetail() {
		int gid = 1;
		String tmp = ServletActionContext.getRequest().getParameter("gid");
		if (tmp != null) {
			gid = Integer.parseInt(tmp);
		}
		HafuGoodComment hafuGoodComment = hafuGoodService.findGoodByGoodId(gid);
		ServletActionContext.getRequest().setAttribute("hafuGoodComment", hafuGoodComment);
		return SUCCESS;
	}
}
