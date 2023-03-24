package com.xiaozhao.blog.config;


import com.xiaozhao.blog.handler.PageableHandlerInterceptor;
import com.xiaozhao.blog.handler.WebSecurityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web MVC配置
 * @Author: XIAO ZHAO
 * @Date: 2022/5/24 17:36
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public WebSecurityHandler getWebSecurityHandler() {
        return new WebSecurityHandler();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOriginPatterns("*")
                .allowedMethods("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PageableHandlerInterceptor());
        registry.addInterceptor(getWebSecurityHandler());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:D:/Project/XIAOZHAO-BLOG/upload/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
