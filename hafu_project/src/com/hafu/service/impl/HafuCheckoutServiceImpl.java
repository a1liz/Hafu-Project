package com.hafu.service.impl;

import com.hafu.dao.HafuCheckoutDao;
import com.hafu.domain.HafuCheckoutComment;
import com.hafu.service.HafuCheckoutService;

public class HafuCheckoutServiceImpl implements HafuCheckoutService{

	private HafuCheckoutDao hafuCheckoutDao;
	@Override
	public void add(HafuCheckoutComment checkout) {
		// TODO Auto-generated method stub
		hafuCheckoutDao.add(checkout);
	}

	@Override
	public void update(HafuCheckoutComment checkout) {
		// TODO Auto-generated method stub
		hafuCheckoutDao.update(checkout);
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		hafuCheckoutDao.delete(cid);
	}

	@Override
	public HafuCheckoutComment findOrderByCheckoutId(int cid) {
		// TODO Auto-generated method stub
		return hafuCheckoutDao.findOrderByCheckoutId(cid);
	}

	@Override
	public HafuCheckoutComment findOrderByUserId(int uid) {
		// TODO Auto-generated method stub
		return hafuCheckoutDao.findOrderByUserId(uid);
	}

	public HafuCheckoutDao getHafuCheckoutDao() {
		return hafuCheckoutDao;
	}

	public void setHafuCheckoutDao(HafuCheckoutDao hafuCheckoutDao) {
		this.hafuCheckoutDao = hafuCheckoutDao;
	}

}
