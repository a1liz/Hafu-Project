package com.hafu.service;

import java.util.List;
import com.hafu.domain.HafuStoreComment;
import com.hafu.vo.StorePage;

/**
 * 商店逻辑
 * @author liz
 *
 */
public interface HafuStoreService {
	// 增加
	public void add(HafuStoreComment store);
	// 修改
	public void update(HafuStoreComment store);
	// 删除
	public void delete(int sid);
	// 根据id去查询商店
	public HafuStoreComment findStoreById(int sid);
	// 根据店名去查询商店
	public StorePage findStoreByName(String storename, int currentPage, int pageSize);
	// 查询所有商店
	public StorePage findAllStore(int currentPage,int pageSize);
}
