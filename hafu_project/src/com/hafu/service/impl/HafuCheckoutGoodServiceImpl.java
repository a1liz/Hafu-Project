package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuCheckoutGoodDao;
import com.hafu.domain.HafuCheckoutGoodComment;
import com.hafu.service.HafuCheckoutGoodService;
import com.hafu.vo.CheckoutGoodPage;

public class HafuCheckoutGoodServiceImpl implements HafuCheckoutGoodService{

	private HafuCheckoutGoodDao hafuCheckoutGoodDao;

	@Override
	public void add(HafuCheckoutGoodComment checkoutGood) {
		// TODO Auto-generated method stub
		hafuCheckoutGoodDao.add(checkoutGood);
	}

	@Override
	public void update(HafuCheckoutGoodComment checkoutGood) {
		// TODO Auto-generated method stub
		hafuCheckoutGoodDao.update(checkoutGood);
	}

	@Override
	public void delete(int cid, int gid) {
		// TODO Auto-generated method stub
		hafuCheckoutGoodDao.delete(cid, gid);
	}

	@Override
	public CheckoutGoodPage findCheckoutGoodByCheckoutId(int cid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		CheckoutGoodPage checkoutGoodPage = new CheckoutGoodPage();
		List<HafuCheckoutGoodComment> list = hafuCheckoutGoodDao.findCheckoutGoodByCheckoutId(cid, currentPage, pageSize);
		checkoutGoodPage.setCheckoutGoods(list);
		checkoutGoodPage.setCurrentPage(currentPage);
		checkoutGoodPage.setPageSize(pageSize);
		int totalCount = hafuCheckoutGoodDao.findTotalOrderGoodCount(cid);
		checkoutGoodPage.setTotalCount(totalCount);
		checkoutGoodPage.setTotalPage(totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1);
		return checkoutGoodPage;
	}

	@Override
	public HafuCheckoutGoodComment findCheckoutGood(int cid, int gid) {
		// TODO Auto-generated method stub
		return hafuCheckoutGoodDao.findCheckoutGood(cid, gid);
	}

	public HafuCheckoutGoodDao getHafuCheckoutDao() {
		return hafuCheckoutGoodDao;
	}

	public void setHafuCheckoutDao(HafuCheckoutGoodDao hafuCheckoutGoodDao) {
		this.hafuCheckoutGoodDao = hafuCheckoutGoodDao;
	}
	
}
