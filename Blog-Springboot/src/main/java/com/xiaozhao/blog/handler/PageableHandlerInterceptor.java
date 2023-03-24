package com.xiaozhao.blog.handler;

import com.aliyun.oss.common.utils.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaozhao.blog.util.PageUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

import static com.xiaozhao.blog.constant.CommonConst.*;

/**
 * 分页拦截器
 * @Author: XIAO ZHAO
 * @Date: 2022/5/24 17:41
 */
public class PageableHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String currentPage = request.getParameter(CURRENT);
        String pageSize = Optional.ofNullable(request.getParameter(SIZE)).orElse(DEFAULT_SIZE);
        if (!StringUtils.isNullOrEmpty(currentPage)) {
            PageUtils.setCurrentPage(new Page<>(Long.parseLong(currentPage), Long.parseLong(pageSize)));
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        PageUtils.remove();
    }

}