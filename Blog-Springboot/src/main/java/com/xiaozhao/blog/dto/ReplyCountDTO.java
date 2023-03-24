package com.xiaozhao.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 回复数量
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 21:10
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyCountDTO {

    /**
     * 评论id
     */
    private Integer commentId;

    /**
     * 回复数量
     */
    private Integer replyCount;

}
