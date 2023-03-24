package com.xiaozhao.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分类选项
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:57
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryOptionDTO {

    /**
     * 分类id
     */
    private Integer id;

    /**
     * 分类名
     */
    private String categoryName;

}
