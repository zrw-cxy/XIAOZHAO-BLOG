package com.xiaozhao.blog.annotation;

import java.lang.annotation.*;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/16 17:34
 * 操作日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {
    /**
     * @return 操作类型
     */
    String optType() default "";
}
