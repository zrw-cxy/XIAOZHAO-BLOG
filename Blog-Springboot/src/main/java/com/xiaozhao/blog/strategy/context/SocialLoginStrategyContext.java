//package com.xiaozhao.blog.strategy.context;
//
//import com.xiaozhao.blog.dto.UserInfoDTO;
//import com.xiaozhao.blog.enums.LoginTypeEnum;
//import com.xiaozhao.blog.strategy.SocialLoginStrategy;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
///**
// * @Author: XIAO ZHAO
// * @Date: 2022/5/23 16:19
// * 第三方登录策略
// */
//
//@Service
//public class SocialLoginStrategyContext {
//
//    @Autowired
//    private Map<String, SocialLoginStrategy> socialLoginStrategyMap;
//
//    /**
//     * 执行第三方登录策略
//     *
//     * @param data          数据
//     * @param loginTypeEnum 登录枚举类型
//     * @return {@link UserInfoDTO} 用户信息
//     */
//    public UserInfoDTO executeLoginStrategy(String data, LoginTypeEnum loginTypeEnum) {
//        return socialLoginStrategyMap.get(loginTypeEnum.getStrategy()).login(data);
//    }
//
//}
