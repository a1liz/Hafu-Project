package com.hafu.dao;

import com.hafu.domain.HafuUserComment;

/**
 * 用户表
 * @author liz
 *
 */
public interface HafuUserDao {
	// 增加
	public void add(HafuUserComment user);
	// 修改
	public void update(HafuUserComment user);
	// 删除
	public void delete(int uid);
	// 根据用户id查询用户
	public HafuUserComment findUserById(int uid);
}
