package com.xiaozhao.blog.handler;

import com.alibaba.fastjson.JSON;
import com.xiaozhao.blog.vo.Result;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.xiaozhao.blog.constant.CommonConst.APPLICATION_JSON;

/**
 * 用户未登录处理
 * @Author: XIAO ZHAO
 * @Date: 2022/5/24 15:56
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
        httpServletResponse.setContentType(APPLICATION_JSON);
        httpServletResponse.getWriter().write(JSON.toJSONString(Result.fail("用户未登录")));
    }

}
