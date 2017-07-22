package com.hafu.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hafu.dao.HafuUserProfileDao;
import com.hafu.domain.HafuUserProfileComment;

public class HafuUserProfileDaoImpl extends HibernateDaoSupport implements HafuUserProfileDao{

	@Override
	public void add(HafuUserProfileComment userProfile) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(userProfile);
	}

	@Override
	public void update(HafuUserProfileComment userProfile) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(userProfile);
	}

	@Override
	public void delete(int pid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findUserProfileByUserProfileId(pid));
	}

	@Override
	public List<HafuUserProfileComment> findUserProfileByUserId(int uid) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from HafuUserProfileComment where uid = ?");
				query.setInteger(0, uid);
				List<HafuUserProfileComment> list = query.list();
				session.close();
				return list;
			}
		});
		return list;
	}

	@Override
	public HafuUserProfileComment findUserProfileByUserProfileId(int pid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(HafuUserProfileComment.class,pid);
	}

}
