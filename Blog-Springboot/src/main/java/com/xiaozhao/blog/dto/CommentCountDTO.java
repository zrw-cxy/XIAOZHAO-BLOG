package com.xiaozhao.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 评论数量
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentCountDTO {

    /**
     * id
     */
    private Integer id;

    /**
     * 评论数量
     */
    private Integer commentCount;
}
