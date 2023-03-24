package com.xiaozhao.blog.strategy;

import com.xiaozhao.blog.dto.UserInfoDTO;

/**
 * 第三方登录策略
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:27
 */

public interface SocialLoginStrategy {

    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoDTO} 用户信息
     */
    UserInfoDTO login(String data);
}
