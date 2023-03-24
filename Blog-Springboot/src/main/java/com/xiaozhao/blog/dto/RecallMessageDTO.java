package com.xiaozhao.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 撤回消息dto
 * @Author: XIAO ZHAO
 * @Date: 2022/5/23 20:52
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecallMessageDTO {

    /**
     * 消息id
     */
    private Integer id;

    /**
     * 是否为语音
     */
    private Boolean isVoice;

}
