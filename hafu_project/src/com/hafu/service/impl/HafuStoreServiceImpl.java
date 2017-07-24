package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuStoreDao;
import com.hafu.domain.HafuStoreComment;
import com.hafu.service.HafuStoreService;
import com.hafu.vo.StorePage;

public class HafuStoreServiceImpl implements HafuStoreService{

	private HafuStoreDao hafuStoreDao;
	
	public void setHafuStoreDao(HafuStoreDao hafuStoreDao) {
		this.hafuStoreDao = hafuStoreDao;
	}
	@Override
	public void add(HafuStoreComment store) {
		// TODO Auto-generated method stub
		hafuStoreDao.add(store);
	}

	@Override
	public void update(HafuStoreComment store) {
		// TODO Auto-generated method stub
		hafuStoreDao.update(store);
	}

	@Override
	public void delete(int sid) {
		// TODO Auto-generated method stub
		hafuStoreDao.delete(sid);
	}

	@Override
	public HafuStoreComment findStoreById(int sid) {
		// TODO Auto-generated method stub
		return hafuStoreDao.findStoreById(sid);
	}

	@Override
	public StorePage findStoreByName(String storename,int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		StorePage storePage = new StorePage();
		List<HafuStoreComment> list = hafuStoreDao.findStoreByName(storename,currentPage, pageSize);
		storePage.setStores(list);
		storePage.setCurrentPage(currentPage);
		storePage.setPageSize(pageSize);
		int totalCount = hafuStoreDao.findTotalSameNameStoreCount(storename);
		storePage.setTotalCount(totalCount);
		storePage.setTotalPage(totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1);
		return storePage;
	}
	@Override
	public StorePage findAllStore(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		StorePage storePage = new StorePage();
		List<HafuStoreComment> list = hafuStoreDao.findAllStore(currentPage, pageSize);
		storePage.setStores(list);
		storePage.setCurrentPage(currentPage);
		storePage.setPageSize(pageSize);
		int totalCount = hafuStoreDao.findTotalStoreCount();
		storePage.setTotalCount(totalCount);
		storePage.setTotalPage(totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1);
		return storePage;
	}

}
