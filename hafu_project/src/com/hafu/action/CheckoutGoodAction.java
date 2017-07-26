package com.hafu.action;

import org.apache.struts2.ServletActionContext;

import com.hafu.domain.HafuCheckoutComment;
import com.hafu.domain.HafuCheckoutGoodComment;
import com.hafu.domain.HafuCheckoutGoodCommentId;
import com.hafu.service.HafuCheckoutGoodService;
import com.hafu.vo.CheckoutGoodPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CheckoutGoodAction extends ActionSupport implements ModelDriven<HafuCheckoutGoodComment>{
	private int currentPage = 1;
	private int pageSize = 20;
	private HafuCheckoutGoodComment hafuCheckoutGoodComment = new HafuCheckoutGoodComment();
	private HafuCheckoutGoodService hafuCheckoutGoodService;
	
	public HafuCheckoutGoodService getHafuCheckoutGoodService() {
		return hafuCheckoutGoodService;
	}

	public void setHafuCheckoutGoodService(HafuCheckoutGoodService hafuCheckoutGoodService) {
		this.hafuCheckoutGoodService = hafuCheckoutGoodService;
	}

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
		HafuCheckoutComment hafuCheckoutComment = (HafuCheckoutComment) ServletActionContext.getRequest().getSession().getAttribute("hafuCheckoutComment");
		HafuCheckoutGoodCommentId id = new HafuCheckoutGoodCommentId();
		id.setCid(hafuCheckoutComment.getCid());
		int gid = 1;
		String tmp = ServletActionContext.getRequest().getParameter("gid");
		if (tmp != null) {
			gid = Integer.parseInt(tmp);
		}
		id.setGid(gid);
		hafuCheckoutGoodComment.setId(id);
		hafuCheckoutGoodComment.setHafuCheckoutComment(hafuCheckoutComment);
		HafuCheckoutGoodComment tmpCheckoutGood = hafuCheckoutGoodService.findCheckoutGood(hafuCheckoutComment.getCid(), gid);
		if (tmpCheckoutGood == null)
			hafuCheckoutGoodService.add(hafuCheckoutGoodComment);
		else {
			hafuCheckoutGoodComment.setGoodnumber(tmpCheckoutGood.getGoodnumber() + hafuCheckoutGoodComment.getGoodnumber());
			hafuCheckoutGoodService.update(hafuCheckoutGoodComment);
		}
		return SUCCESS;
	}
	
	public String search() {
		HafuCheckoutComment hafuCheckoutComment = (HafuCheckoutComment) ServletActionContext.getRequest().getSession().getAttribute("hafuCheckoutComment");
		CheckoutGoodPage checkoutGoodPage = hafuCheckoutGoodService.findCheckoutGoodByCheckoutId(hafuCheckoutComment.getCid(), currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("checkoutGoodPage", checkoutGoodPage);
		return SUCCESS;
	}
	
	public String clear() {
		HafuCheckoutComment hafuCheckoutComment = (HafuCheckoutComment) ServletActionContext.getRequest().getSession().getAttribute("hafuCheckoutComment");
		hafuCheckoutGoodService.deleteByCheckoutId(hafuCheckoutComment.getCid());
		return SUCCESS;
	}
}
