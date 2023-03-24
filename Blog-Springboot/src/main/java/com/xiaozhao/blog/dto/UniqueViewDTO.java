package com.xiaozhao.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 17:53
 * 访问量
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UniqueViewDTO {

    /**
     * 日期
     */
    private String day;

    /**
     * 访问量
     */
    private Integer viewsCount;

}
