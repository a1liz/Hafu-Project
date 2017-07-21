package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuOrderGoodDao;
import com.hafu.domain.HafuOrderGoodComment;
import com.hafu.service.HafuOrderGoodService;

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
	public List<HafuOrderGoodComment> findOrderGoodByOrderId(int orderid) {
		// TODO Auto-generated method stub
		return hafuOrderGoodDao.findOrderGoodByOrderId(orderid);
	}

	@Override
	public HafuOrderGoodComment findOrderGoddById(int orderid, int gid) {
		// TODO Auto-generated method stub
		return hafuOrderGoodDao.findOrderGoddById(orderid, gid);
	}

}
