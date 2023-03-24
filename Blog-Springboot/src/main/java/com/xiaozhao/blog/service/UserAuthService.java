package com.xiaozhao.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhao.blog.dto.UserAreaDTO;
import com.xiaozhao.blog.dto.UserBackDTO;
import com.xiaozhao.blog.dto.UserInfoDTO;
import com.xiaozhao.blog.entity.UserAuth;
import com.xiaozhao.blog.vo.*;

import java.util.List;

/**
 * 用户账号服务
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 22:39
 */
public interface UserAuthService extends IService<UserAuth> {

    /**
     * 发送邮箱验证码
     *
     * @param username 邮箱号
     */
    void sendCode(String username);

    /**
     * 获取用户区域分布
     *
     * @param conditionVO 条件签证官
     * @return {@link List <UserAreaDTO>} 用户区域分布
     */
    List<UserAreaDTO> listUserAreas(ConditionVO conditionVO);

    /**
     * 用户注册
     *
     * @param user 用户对象
     */
    void register(UserVO user);

    /**
     * qq登录
     *
     * @param qqLoginVO qq登录信息
     * @return 用户登录信息
     */
//    UserInfoDTO qqLogin(QQLoginVO qqLoginVO);
//
//    /**
//     * 微博登录
//     *
//     * @param weiboLoginVO 微博登录信息
//     * @return 用户登录信息
//     */
//    UserInfoDTO weiboLogin(WeiboLoginVO weiboLoginVO);

    /**
     * 修改密码
     *
     * @param user 用户对象
     */
    void updatePassword(UserVO user);

    /**
     * 修改管理员密码
     *
     * @param passwordVO 密码对象
     */
    void updateAdminPassword(PasswordVO passwordVO);

    /**
     * 查询后台用户列表
     *
     * @param condition 条件
     * @return 用户列表
     */
    PageResult<UserBackDTO> listUserBackDTO(ConditionVO condition);

}
