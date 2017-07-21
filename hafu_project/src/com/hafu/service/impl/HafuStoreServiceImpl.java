package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuStoreDao;
import com.hafu.domain.HafuStoreComment;
import com.hafu.service.HafuStoreService;

public class HafuStoreServiceImpl implements HafuStoreService{

	private HafuStoreDao hafuStoreDao;
	
	public void setHafuStoreDao(HafuStoreDao hafuStoreDao) {
		this.hafuStoreDao = hafuStoreDao;
	}
	@Override
	public void add(HafuStoreComment store) {
		// TODO Auto-generated method stub
		hafuStoreDao.add(store);
	}

	@Override
	public void update(HafuStoreComment store) {
		// TODO Auto-generated method stub
		hafuStoreDao.update(store);
	}

	@Override
	public void delete(int sid) {
		// TODO Auto-generated method stub
		hafuStoreDao.delete(sid);
	}

	@Override
	public HafuStoreComment findStoreById(int sid) {
		// TODO Auto-generated method stub
		return hafuStoreDao.findStoreById(sid);
	}

	@Override
	public List<HafuStoreComment> findStoreByName(String storename) {
		// TODO Auto-generated method stub
		return hafuStoreDao.findStoreByName(storename);
	}

}
