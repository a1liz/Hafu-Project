package com.hafu.service.impl;

import com.hafu.dao.HafuOrderDao;
import com.hafu.domain.HafuOrderComment;
import com.hafu.service.HafuOrderService;

public class HafuOrderServiceImpl implements HafuOrderService{

	private HafuOrderDao hafuOrderDao;
	
	public void setHafuOrderDao(HafuOrderDao hafuOrderDao) {
		this.hafuOrderDao = hafuOrderDao;
	}
	
	@Override
	public void add(HafuOrderComment order) {
		// TODO Auto-generated method stub
		hafuOrderDao.add(order);
	}

	@Override
	public void update(HafuOrderComment order) {
		// TODO Auto-generated method stub
		hafuOrderDao.update(order);
	}

	@Override
	public void delete(int orderid) {
		// TODO Auto-generated method stub
		hafuOrderDao.delete(orderid);
	}

	@Override
	public HafuOrderComment findOrderById(int orderid) {
		// TODO Auto-generated method stub
		return hafuOrderDao.findOrderById(orderid);
	}

}
