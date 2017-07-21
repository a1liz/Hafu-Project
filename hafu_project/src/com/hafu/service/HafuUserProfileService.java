package com.hafu.service;

import java.util.List;
import com.hafu.domain.HafuUserProfileComment;

/**
 * 用户信息逻辑
 * @author liz
 *
 */
public interface HafuUserProfileService {
	// 增加
	public void add(HafuUserProfileComment userProfile);
	// 修改
	public void update(HafuUserProfileComment userProfile);
	/// 删除
	public void delete(int pid);
	// 根据用户id去查询所有相关用户信息
	public List<HafuUserProfileComment> findUserProfileByUserId(int uid);
	// 根据用户信息id查询某条用户信息
	public HafuUserProfileComment findUserProfileByUserProfileId(int pid);

}
