package com.xiaozhao.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户菜单
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:35
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserMenuDTO {

    /**
     * 菜单名
     */
    private String name;

    /**
     * 路径
     */
    private String path;

    /**
     * 组件
     */
    private String component;

    /**
     * icon
     */
    private String icon;

    /**
     * 是否隐藏
     */
    private Boolean hidden;

    /**
     * 子菜单列表
     */
    private List<UserMenuDTO> children;

}
