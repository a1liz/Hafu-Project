package com.hafu.service.impl;

import java.util.List;

import com.hafu.dao.HafuGoodDao;
import com.hafu.domain.HafuGoodComment;
import com.hafu.service.HafuGoodService;
import com.hafu.vo.GoodPage;

public class HafuGoodServiceImpl implements HafuGoodService{

	private HafuGoodDao hafuGoodDao;
	
	public void setHafuGoodDao(HafuGoodDao hafuGoodDao) {
		this.hafuGoodDao = hafuGoodDao;
	}
	
	@Override
	public void add(HafuGoodComment good) {
		// TODO Auto-generated method stub
		hafuGoodDao.add(good);
	}

	@Override
	public void update(HafuGoodComment good) {
		// TODO Auto-generated method stub
		hafuGoodDao.update(good);
	}

	@Override
	public void delete(int gid) {
		// TODO Auto-generated method stub
		hafuGoodDao.delete(gid);
	}

	@Override
	public GoodPage findGoodByStoreId(int sid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		GoodPage goodPage = new GoodPage();
		List<HafuGoodComment> list = hafuGoodDao.findGoodByStoreId(sid, currentPage, pageSize);
		goodPage.setGoods(list);
		goodPage.setCurrentPage(currentPage);
		goodPage.setPageSize(pageSize);
		int totalCount = hafuGoodDao.findTotalGoodCount(sid);
		goodPage.setTotalCount(totalCount);
		goodPage.setTotalPage(totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1);
		return goodPage;
	}

	@Override
	public HafuGoodComment findGoodByGoodId(int gid) {
		// TODO Auto-generated method stub
		return hafuGoodDao.findGoodByGoodId(gid);
	}
}
