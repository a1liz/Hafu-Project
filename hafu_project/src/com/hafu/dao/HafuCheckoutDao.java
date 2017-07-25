package com.hafu.dao;

import com.hafu.domain.HafuCheckoutComment;

/**
 * 购物车类
 * @author liz
 *
 */
public interface HafuCheckoutDao {
	// 增加
	public void add(HafuCheckoutComment checkout);
	// 修改
	public void update(HafuCheckoutComment checkout);
	// 删除
	public void delete(int cid);
	// 根据购物车id查询购物车
	public HafuCheckoutComment findOrderByCheckoutId(int cid);
	// 根据用户id查询购物车
	public HafuCheckoutComment findOrderByUserId(int uid);
}
