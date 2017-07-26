package com.hafu.dao;

import java.util.List;

import com.hafu.domain.HafuCheckoutGoodComment;

/**
 * 购物车商品类
 * @author liz
 *
 */
public interface HafuCheckoutGoodDao {
	// 增加
	public void add(HafuCheckoutGoodComment checkoutGood);
	// 修改
	public void update(HafuCheckoutGoodComment checkoutGood);
	// 删除
	public void delete(int cid,int gid);
	// 删除某一购物车对应的所有商品信息
	public void deleteByCheckoutId(int cid);
	// 根据购物车id查询购物车详情
	public List<HafuCheckoutGoodComment> findCheckoutGoodByCheckoutId(int cid,int currentPage,int pageSize);
	// 根据购物车id和商品id查询某一购物车对应商品详情
	public HafuCheckoutGoodComment findCheckoutGood(int cid,int gid);
	// 根据购物车id查询购物车所有商品种类数量
	public int findTotalOrderGoodCount(int cid);
}
