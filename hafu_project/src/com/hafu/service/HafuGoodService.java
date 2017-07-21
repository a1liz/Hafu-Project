package com.hafu.service;

import java.util.List;

import com.hafu.domain.HafuGoodComment;

/**
 * 商店业务逻辑
 * @author liz
 *
 */
public interface HafuGoodService {
	// 增加
	public void add(HafuGoodComment good);
	// 修改
	public void update(HafuGoodComment good);
	// 删除
	public void delete(int gid);
	// 根据商店id查找商品
	public List<HafuGoodComment> findGoodByStoreId(int sid);
	// 根据商品id查找商品
	public HafuGoodComment findGoodByGoodId(int gid);
}
