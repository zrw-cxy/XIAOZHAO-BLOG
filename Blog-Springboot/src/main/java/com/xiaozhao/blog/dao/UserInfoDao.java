package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * 用户信息
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 17:56
 */

@Repository
public interface UserInfoDao extends BaseMapper<UserInfo> {

}
