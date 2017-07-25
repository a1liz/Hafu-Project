package com.hafu.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hafu.dao.HafuCheckoutGoodDao;
import com.hafu.dao.HafuGoodDao;
import com.hafu.domain.HafuCheckoutGoodComment;
import com.hafu.domain.HafuCheckoutGoodContent;
import com.hafu.domain.HafuGoodComment;
import com.hafu.service.HafuCheckoutGoodService;
import com.hafu.vo.CheckoutGoodPage;

public class HafuCheckoutGoodServiceImpl implements HafuCheckoutGoodService{

	private HafuCheckoutGoodDao hafuCheckoutGoodDao;
	private HafuGoodDao hafuGoodDao;

	public HafuCheckoutGoodDao getHafuCheckoutGoodDao() {
		return hafuCheckoutGoodDao;
	}

	@Override
	public void add(HafuCheckoutGoodComment checkoutGood) {
		// TODO Auto-generated method stub
		hafuCheckoutGoodDao.add(checkoutGood);
	}

	@Override
	public void update(HafuCheckoutGoodComment checkoutGood) {
		// TODO Auto-generated method stub
		hafuCheckoutGoodDao.update(checkoutGood);
	}

	@Override
	public void delete(int cid, int gid) {
		// TODO Auto-generated method stub
		hafuCheckoutGoodDao.delete(cid, gid);
	}

	@Override
	public CheckoutGoodPage findCheckoutGoodByCheckoutId(int cid, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		CheckoutGoodPage checkoutGoodPage = new CheckoutGoodPage();
		List<HafuCheckoutGoodComment> list = hafuCheckoutGoodDao.findCheckoutGoodByCheckoutId(cid, currentPage, pageSize);
		List<HafuCheckoutGoodContent> list2 = new ArrayList();
		for (HafuCheckoutGoodComment hafuCheckoutGoodComment : list) {
			HafuCheckoutGoodContent hafuCheckoutGoodContent = new HafuCheckoutGoodContent();
			hafuCheckoutGoodContent.setCid(hafuCheckoutGoodComment.getId().getCid());
			hafuCheckoutGoodContent.setGid(hafuCheckoutGoodComment.getId().getGid());
			hafuCheckoutGoodContent.setGoodnumber(hafuCheckoutGoodComment.getGoodnumber());
			HafuGoodComment tmpGoodComment = hafuGoodDao.findGoodByGoodId(hafuCheckoutGoodComment.getId().getGid());
			hafuCheckoutGoodContent.setGoodname(tmpGoodComment.getGoodname());
			hafuCheckoutGoodContent.setGoodPrice(tmpGoodComment.getGoodPrice() * hafuCheckoutGoodComment.getGoodnumber());
			hafuCheckoutGoodContent.setIcon(tmpGoodComment.getIcon());
			list2.add(hafuCheckoutGoodContent);
		}
		checkoutGoodPage.setCheckoutGoods(list2);
		checkoutGoodPage.setCurrentPage(currentPage);
		checkoutGoodPage.setPageSize(pageSize);
		int totalCount = hafuCheckoutGoodDao.findTotalOrderGoodCount(cid);
		checkoutGoodPage.setTotalCount(totalCount);
		checkoutGoodPage.setTotalPage(totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize + 1);
		return checkoutGoodPage;
	}

	@Override
	public HafuCheckoutGoodComment findCheckoutGood(int cid, int gid) {
		// TODO Auto-generated method stub
		return hafuCheckoutGoodDao.findCheckoutGood(cid, gid);
	}

	public HafuCheckoutGoodDao getHafuCheckoutDao() {
		return hafuCheckoutGoodDao;
	}

	public void setHafuCheckoutGoodDao(HafuCheckoutGoodDao hafuCheckoutGoodDao) {
		this.hafuCheckoutGoodDao = hafuCheckoutGoodDao;
	}

	public HafuGoodDao getHafuGoodDao() {
		return hafuGoodDao;
	}

	public void setHafuGoodDao(HafuGoodDao hafuGoodDao) {
		this.hafuGoodDao = hafuGoodDao;
	}
	
}
