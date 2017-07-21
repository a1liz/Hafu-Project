package com.hafu.service;

import com.hafu.domain.HafuOrderComment;

/**
 * 订单逻辑
 * @author liz
 *
 */
public interface HafuOrderService {
	// 增加
	public void add(HafuOrderComment order);
	// 修改
	public void update(HafuOrderComment order);
	// 删除
	public void delete(int orderid);
	// 根据订单id查询订单	
	public HafuOrderComment findOrderById(int orderid);
}
