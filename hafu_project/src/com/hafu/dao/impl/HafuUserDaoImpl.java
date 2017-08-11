package com.hafu.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuUserDao;
import com.hafu.domain.HafuUserComment;

public class HafuUserDaoImpl extends HibernateDaoSupport implements HafuUserDao{

	@Override
	public void add(HafuUserComment user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void update(HafuUserComment user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public void delete(int uid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findUserById(uid));
	}

	@Override
	public HafuUserComment findUserById(int uid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(HafuUserComment.class, uid);
	}
	
}
