package com.hafu.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuCheckoutGoodDao;
import com.hafu.domain.HafuCheckoutGoodComment;

public class HafuCheckoutGoodDaoImpl extends HibernateDaoSupport implements HafuCheckoutGoodDao{

	@Override
	public void add(HafuCheckoutGoodComment checkoutGood) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(checkoutGood);
	}

	@Override
	public void update(HafuCheckoutGoodComment checkoutGood) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(checkoutGood);
	}

	@Override
	public void delete(int cid, int gid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findCheckoutGood(cid, gid));
	}

	@Override
	public List<HafuCheckoutGoodComment> findCheckoutGoodByCheckoutId(int cid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuCheckoutGoodComment where cid = ?");
				query.setInteger(0, cid);
				query.setFirstResult(currentPage);
				query.setMaxResults(pageSize);
				List<HafuCheckoutGoodComment> list = query.list();
				session.close();
				return list;
			}
		});
		return list;
	}

	@Override
	public HafuCheckoutGoodComment findCheckoutGood(int cid, int gid) {
		// TODO Auto-generated method stub
		List<HafuCheckoutGoodComment> list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuCheckoutGoodComment where cid = ? and gid = ?");
				query.setInteger(0, cid);
				query.setInteger(1, gid);
				List<HafuCheckoutGoodComment> list = query.list();
				session.close();
				return list;
			}
		});
		if (list.size() == 0) {
			return null;
		}
		else 
			return list.get(0);
	}	

	@Override
	public int findTotalOrderGoodCount(int cid) {
		// TODO Auto-generated method stub
		List<Integer> list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("select count(*) from HafuCheckoutGoodComment where cid = ?");
				query.setInteger(0, cid);
				List<Integer> list = query.list();
				session.close();
				return list;
			}
		});
		return list.get(0);
	}

}
