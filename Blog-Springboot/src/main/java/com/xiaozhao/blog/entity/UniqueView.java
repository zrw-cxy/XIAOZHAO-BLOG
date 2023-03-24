package com.xiaozhao.blog.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/16 20:35
 * 网站访问量
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_unique_view")
public class UniqueView {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 访问量
     */
    private Integer viewsCount;

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
