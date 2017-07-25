package com.hafu.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuCheckoutDao;
import com.hafu.domain.HafuCheckoutComment;

public class HafuCheckoutDaoImpl extends HibernateDaoSupport implements HafuCheckoutDao{

	@Override
	public void add(HafuCheckoutComment checkout) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(checkout);
	}

	@Override
	public void update(HafuCheckoutComment checkout) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(checkout);
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findOrderByCheckoutId(cid));
	}

	@Override
	public HafuCheckoutComment findOrderByCheckoutId(int cid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(HafuCheckoutComment.class, cid);
	}

	@Override
	public HafuCheckoutComment findOrderByUserId(int uid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(HafuCheckoutComment.class, uid);
	}

}
