package com.xiaozhao.blog.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 时区枚举
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:39
 */

@Getter
@AllArgsConstructor
public enum ZoneEnum {

    /**
     * 上海
     */
    SHANGHAI("Asia/Shanghai", "中国上海");

    /**
     * 时区
     */
    private final String zone;

    /**
     * 描述
     */
    private final String desc;

}
