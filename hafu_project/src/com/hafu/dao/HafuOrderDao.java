package com.hafu.dao;

import com.hafu.domain.HafuOrderComment;

/**
 * 订单类
 * @author liz
 *
 */
public interface HafuOrderDao {
	// 增加
	public void add(HafuOrderComment order);
	// 修改
	public void update(HafuOrderComment order);
	// 删除
	public void delete(int orderid);
	// 根据订单id查询订单
	public HafuOrderComment findOrderById(int orderid);
}
