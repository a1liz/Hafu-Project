package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuGoodDao;
import com.hafu.domain.HafuGoodComment;
import com.hafu.service.HafuGoodService;

public class HafuGoodServiceImpl implements HafuGoodService{

	private HafuGoodDao hafuGoodDao;
	
	public void setHafuGoodDao(HafuGoodDao hafuGoodDao) {
		this.hafuGoodDao = hafuGoodDao;
	}
	
	@Override
	public void add(HafuGoodComment good) {
		// TODO Auto-generated method stub
		hafuGoodDao.add(good);
	}

	@Override
	public void update(HafuGoodComment good) {
		// TODO Auto-generated method stub
		hafuGoodDao.update(good);
	}

	@Override
	public void delete(int gid) {
		// TODO Auto-generated method stub
		hafuGoodDao.delete(gid);
	}

	@Override
	public List<HafuGoodComment> findGoodByStoreId(int sid) {
		// TODO Auto-generated method stub
		return hafuGoodDao.findGoodByStoreId(sid);
	}

	@Override
	public HafuGoodComment findGoodByGoodId(int gid) {
		// TODO Auto-generated method stub
		return hafuGoodDao.findGoodByGoodId(gid);
	}
}
