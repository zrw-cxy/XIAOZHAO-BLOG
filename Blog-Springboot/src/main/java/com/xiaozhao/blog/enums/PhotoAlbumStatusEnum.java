package com.xiaozhao.blog.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 相册状态枚举
 * @Author: XIAO ZHAO
 * @Date: 2022/5/24 15:48
 */
@Getter
@AllArgsConstructor
public enum PhotoAlbumStatusEnum {
    /**
     * 公开
     */
    PUBLIC(1, "公开"),
    /**
     * 私密
     */
    SECRET(2, "私密");

    /**
     * 状态
     */
    private final Integer status;

    /**
     * 描述
     */
    private final String desc;

}
