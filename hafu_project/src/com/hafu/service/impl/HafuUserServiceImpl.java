package com.hafu.service.impl;

import com.hafu.dao.HafuUserDao;
import com.hafu.domain.HafuUserComment;
import com.hafu.service.HafuUserService;

public class HafuUserServiceImpl implements HafuUserService{

	private HafuUserDao hafuUserDao;
	
	public void setHafuUserDao(HafuUserDao hafuUserDao) {
		this.hafuUserDao = hafuUserDao;
	}

	@Override
	public void add(HafuUserComment user) {
		// TODO Auto-generated method stub
		hafuUserDao.add(user);
	}

	@Override
	public void update(HafuUserComment user) {
		// TODO Auto-generated method stub
		hafuUserDao.update(user);
	}

	@Override
	public void delete(int uid) {
		// TODO Auto-generated method stub
		hafuUserDao.delete(uid);
	}

	@Override
	public HafuUserComment findUserById(int uid) {
		// TODO Auto-generated method stub
		return hafuUserDao.findUserById(uid);
	}

}
