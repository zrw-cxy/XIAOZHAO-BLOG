package com.xiaozhao.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhao.blog.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜单
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:34
 */
@Repository
public interface MenuDao extends BaseMapper<Menu> {

    /**
     * 根据用户id查询菜单
     * @param userInfoId 用户信息id
     * @return 菜单列表
     */
    List<Menu> listMenusByUserInfoId(Integer userInfoId);

}
