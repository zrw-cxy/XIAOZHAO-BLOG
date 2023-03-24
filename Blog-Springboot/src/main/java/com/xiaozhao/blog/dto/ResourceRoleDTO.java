package com.xiaozhao.blog.dto;

import lombok.Data;

import java.util.List;

/**
 * 资源角色
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:42
 */

@Data
public class ResourceRoleDTO {

    /**
     * 资源id
     */
    private Integer id;

    /**
     * 路径
     */
    private String url;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 角色名
     */
    private List<String> roleList;

}
