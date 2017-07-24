package com.hafu.dao;

import java.util.List;

import com.hafu.domain.HafuStoreComment;

/**
 * 商店类
 * @author liz
 * 
 */
public interface HafuStoreDao {
	// 增加
	public void add(HafuStoreComment store);
	// 修改
	public void update(HafuStoreComment store);
	// 删除
	public void delete(int sid);
	// 根据id去查询商店
	public HafuStoreComment findStoreById(int sid);
	// 根据店名去查询商店
	public List<HafuStoreComment> findStoreByName(String storename, int currentPage, int pageSize);
	// 查询所有商店
	public List<HafuStoreComment> findAllStore(int currentPage,int pageSize);
	// 查询所有商店数量
	public int findTotalStoreCount();
	// 根据店名查询所有同名商店数量
	public int findTotalSameNameStoreCount(String storename);
}
