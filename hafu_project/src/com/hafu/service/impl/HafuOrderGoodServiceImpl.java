package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuOrderGoodDao;
import com.hafu.domain.HafuOrderGoodComment;
import com.hafu.service.HafuOrderGoodService;
import com.hafu.vo.OrderGoodPage;

public class HafuOrderGoodServiceImpl implements HafuOrderGoodService{

	private HafuOrderGoodDao hafuOrderGoodDao;
	
	public void setHafuOrderGoodDao(HafuOrderGoodDao hafuOrderGoodDao) {
		this.hafuOrderGoodDao = hafuOrderGoodDao;
	}
	
	@Override
	public void add(HafuOrderGoodComment orderGood) {
		// TODO Auto-generated method stub
		hafuOrderGoodDao.add(orderGood);
	}

	@Override
	public void update(HafuOrderGoodComment orderGood) {
		// TODO Auto-generated method stub
		hafuOrderGoodDao.update(orderGood);
	}

	@Override
	public void delete(int orderid, int gid) {
		// TODO Auto-generated method stub
		hafuOrderGoodDao.delete(orderid, gid);
	}

	@Override
	public OrderGoodPage findOrderGoodByOrderId(int orderid,int currentPage,int pageSize) {
		// TODO Auto-generated method stub
		OrderGoodPage orderGoodPage = new OrderGoodPage();
		List<HafuOrderGoodComment> list = hafuOrderGoodDao.findOrderGoodByOrderId(orderid, currentPage, pageSize);
		orderGoodPage.setOrderGoods(list);
		orderGoodPage.setCurrentPage(currentPage);
		orderGoodPage.setPageSize(pageSize);
		int totalCount = hafuOrderGoodDao.findTotalOrderGoodCount(orderid);
		orderGoodPage.setTotalCount(totalCount);
		orderGoodPage.setTotalPage(totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1);
		return orderGoodPage;
	}

	@Override
	public HafuOrderGoodComment findOrderGoodById(int orderid, int gid) {
		// TODO Auto-generated method stub
		return hafuOrderGoodDao.findOrderGoodById(orderid, gid);
	}

}
