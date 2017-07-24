package com.hafu.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuGoodDao;
import com.hafu.domain.HafuGoodComment;

public class HafuGoodDaoImpl extends HibernateDaoSupport implements HafuGoodDao {

	@Override
	public void add(HafuGoodComment good) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(good);
	}

	@Override
	public void update(HafuGoodComment good) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(good);
	}

	@Override
	public void delete(int gid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findGoodByGoodId(gid));
	}

	@Override
	public List<HafuGoodComment> findGoodByStoreId(int sid,int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuGoodComment where sid = ?");
				query.setInteger(0, sid);
				query.setFirstResult(currentPage);
				query.setMaxResults(pageSize);
				List<HafuGoodComment> list = query.list();
				session.close();
				return list;
			}
		});
		return list;
	}

	@Override
	public HafuGoodComment findGoodByGoodId(int gid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(HafuGoodComment.class, gid);
	}

	@Override
	public int findTotalGoodCount(int sid) {
		// TODO Auto-generated method stub
		Long count = (Long) this.getHibernateTemplate().find("select count(*) from HafuGoodComment").listIterator().next();
		return count.intValue();
	}

}
