package com.hafu.vo;

import java.util.List;

import com.hafu.domain.HafuStoreComment;

public class StorePage {
	private int pageSize;
	private int currentPage;
	private int totalCount;
	private int totalPage;
	private List<HafuStoreComment> stores;
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
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<HafuStoreComment> getStores() {
		return stores;
	}
	public void setStores(List<HafuStoreComment> stores) {
		this.stores = stores;
	}
	
}
