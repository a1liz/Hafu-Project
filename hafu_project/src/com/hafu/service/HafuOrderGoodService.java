package com.hafu.service;

import java.util.List;

import com.hafu.domain.HafuOrderGoodComment;

/**
 * 订单对应商品逻辑
 * @author liz
 *
 */
public interface HafuOrderGoodService {
	// 增加
	public void add(HafuOrderGoodComment orderGood);
	// 修改
	public void update(HafuOrderGoodComment orderGood);
	// 删除
	public void delete(int orderid,int gid);
	// 根据订单id查询订单详情
	public List<HafuOrderGoodComment> findOrderGoodByOrderId(int orderid);
	// 根据订单id和商品id查询某一订单对应商品详情
	public HafuOrderGoodComment findOrderGoddById(int orderid,int gid);

}
