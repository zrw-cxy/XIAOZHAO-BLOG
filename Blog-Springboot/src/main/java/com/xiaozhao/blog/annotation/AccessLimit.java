package com.xiaozhao.blog.annotation;

import java.lang.annotation.*;

/**
 * redis接口限流
 * @Author: XIAO ZHAO
 * @Date: 2022/5/16 17:32
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AccessLimit {
    /**
     * 单位时间（秒）
     *
     * @return int
     */
    int seconds();

    /**
     * 单位时间最大请求次数
     *
     * @return int
     */
    int maxCount();
}
