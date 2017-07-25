package com.hafu.dao;

import java.util.List;

import com.hafu.domain.HafuOrderGoodComment;

/**
 * 订单商品类
 * @author liz
 *
 */
public interface HafuOrderGoodDao {
	// 增加
	public void add(HafuOrderGoodComment orderGood);
	// 修改
	public void update(HafuOrderGoodComment orderGood);
	// 删除
	public void delete(int orderid,int gid);
	// 根据订单id查询订单详情
	public List<HafuOrderGoodComment> findOrderGoodByOrderId(int orderid, int currentPage, int pageSize);
	// 根据订单id和商品id查询某一订单对应商品详情
	public HafuOrderGoodComment findOrderGoodById(int orderid,int gid);
	// 根据订单id查询订单所有商品种类数量
	public int findTotalOrderGoodCount(int orderid);
}
