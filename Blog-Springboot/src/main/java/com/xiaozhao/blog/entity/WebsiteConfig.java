package com.xiaozhao.blog.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/16 20:37
 * 网站配置
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value = "tb_website_config")
public class WebsiteConfig {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 配置信息
     */
    private String config;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

}