package com.hafu.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuOrderGoodDao;
import com.hafu.domain.HafuOrderGoodComment;

public class HafuOrderGoodDaoImpl extends HibernateDaoSupport implements HafuOrderGoodDao {

	@Override
	public void add(HafuOrderGoodComment orderGood) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(orderGood);
	}

	@Override
	public void update(HafuOrderGoodComment orderGood) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(orderGood);
	}

	@Override
	public void delete(int orderid, int gid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findOrderGoddById(orderid, gid));
	}

	@Override
	public List<HafuOrderGoodComment> findOrderGoodByOrderId(int orderid) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuOrderGoodComment where orderid = ?");
				query.setInteger(0, orderid);
				List<HafuOrderGoodComment> list = query.list();
				session.close();
				return list;
			}
			
		});
		return list;
	}

	@Override
	public HafuOrderGoodComment findOrderGoddById(int orderid, int gid) {
		// TODO Auto-generated method stub
		List<HafuOrderGoodComment> list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuOrderGoodComment where orderid = ? and gid = ?");
				query.setInteger(0, orderid);
				query.setInteger(1, gid);
				List<HafuOrderGoodComment> list = query.list();
				session.close();
				return list;
			}
		});
		return list.get(0);
	}


}
