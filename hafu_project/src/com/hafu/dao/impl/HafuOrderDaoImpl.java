package com.hafu.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuOrderDao;
import com.hafu.domain.HafuOrderComment;

public class HafuOrderDaoImpl extends HibernateDaoSupport implements HafuOrderDao {

	@Override
	public void add(HafuOrderComment order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(order);
	}

	@Override
	public void update(HafuOrderComment order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(order);
	}

	@Override
	public void delete(int orderid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findOrderById(orderid));
	}

	@Override
	public HafuOrderComment findOrderById(int orderid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(HafuOrderComment.class, orderid);
	}

}
