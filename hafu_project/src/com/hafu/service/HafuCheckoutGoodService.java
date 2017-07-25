package com.hafu.service;

import java.util.List;

import com.hafu.domain.HafuCheckoutGoodComment;
import com.hafu.vo.CheckoutGoodPage;

/**
 * 购物车对应商品逻辑
 * @author liz
 *
 */
public interface HafuCheckoutGoodService {
	// 增加
	public void add(HafuCheckoutGoodComment checkoutGood);
	// 修改
	public void update(HafuCheckoutGoodComment checkoutGood);
	// 删除
	public void delete(int cid,int gid);
	// 根据购物车id查询购物车详情
	public CheckoutGoodPage findCheckoutGoodByCheckoutId(int cid,int currentPage,int pageSize);
	// 根据购物车id和商品id查询某一购物车对应商品详情
	public HafuCheckoutGoodComment findCheckoutGood(int cid,int gid);
}
