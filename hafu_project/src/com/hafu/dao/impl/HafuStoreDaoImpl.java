package com.hafu.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuStoreDao;
import com.hafu.domain.HafuStoreComment;

public class HafuStoreDaoImpl extends HibernateDaoSupport implements HafuStoreDao{

	@Override
	public void add(HafuStoreComment store) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(store);
	}

	@Override
	public void update(HafuStoreComment store) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(store);
	}

	@Override
	public void delete(int sid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findStoreById(sid));
	}

	@Override
	public HafuStoreComment findStoreById(int sid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(HafuStoreComment.class, sid);
	}

	@Override
	public List<HafuStoreComment> findStoreByName(String storename, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuStoreComment where storename = ?");
				query.setString(0, storename);
				query.setFirstResult(currentPage);
				query.setMaxResults(pageSize);
				List<HafuStoreComment> list = query.list();
				session.close();
				return list;
			}
		});
		return list;
	}

	@Override
	public List<HafuStoreComment> findAllStore(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuStoreComment");
				query.setFirstResult(currentPage);
				query.setMaxResults(pageSize);
				List<HafuStoreComment> list = query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public int findTotalStoreCount() {
		// TODO Auto-generated method stub
		Long count = (Long) this.getHibernateTemplate().find("select count(*) from HafuStoreComment").listIterator().next();
		return count.intValue();
	}

	@Override
	public int findTotalSameNameStoreCount(String storename) {
		// TODO Auto-generated method stub
//		Long count = (Long) this.getHibernateTemplate().executeFind(new HibernateCallback() {
//
//			@Override
//			public Object doInHibernate(Session session) throws HibernateException, SQLException {
//				// TODO Auto-generated method stub
//				Query query = session.createQuery("select count(*) from HafuStoreComment where storename = ?");
//				query.setString(0, storename);
//				return query.list().get(0);
//			}
//		});
		// 待修改
		return 0; 
	}

}
