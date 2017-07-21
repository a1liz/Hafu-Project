package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuUserProfileDao;
import com.hafu.domain.HafuUserProfileComment;
import com.hafu.service.HafuUserProfileService;

public class HafuUserProfileServiceImpl implements HafuUserProfileService{

	private HafuUserProfileDao hafuUserProfileDao;
	
	public void setHafuUserProfileDao(HafuUserProfileDao hafuUserProfileDao) {
		this.hafuUserProfileDao = hafuUserProfileDao;
	}
	
	@Override
	public void add(HafuUserProfileComment userProfile) {
		// TODO Auto-generated method stub
		hafuUserProfileDao.add(userProfile);
	}

	@Override
	public void update(HafuUserProfileComment userProfile) {
		// TODO Auto-generated method stub
		hafuUserProfileDao.update(userProfile);
	}

	@Override
	public void delete(int pid) {
		// TODO Auto-generated method stub
		hafuUserProfileDao.delete(pid);
	}

	@Override
	public List<HafuUserProfileComment> findUserProfileByUserId(int uid) {
		// TODO Auto-generated method stub
		return hafuUserProfileDao.findUserProfileByUserId(uid);
	}

	@Override
	public HafuUserProfileComment findUserProfileByUserProfileId(int pid) {
		// TODO Auto-generated method stub
		return hafuUserProfileDao.findUserProfileByUserProfileId(pid);
	}

}
