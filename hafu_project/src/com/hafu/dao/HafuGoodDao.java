package com.hafu.dao;

import java.util.List;

import com.hafu.domain.HafuGoodComment;

/**
 * 商品类
 * @author liz
 *
 */
public interface HafuGoodDao {
	// 增加
	public void add(HafuGoodComment good);
	// 修改
	public void update(HafuGoodComment good);
	// 删除
	public void delete(int gid);
	// 根据商店id查找商品
	public List<HafuGoodComment> findGoodByStoreId(int sid,int currentPage, int pageSize);
	// 根据商品id查找商品
	public HafuGoodComment findGoodByGoodId(int gid);
	// 根据商店id查询商品总数
	public int findTotalGoodCount(int sid);
}
