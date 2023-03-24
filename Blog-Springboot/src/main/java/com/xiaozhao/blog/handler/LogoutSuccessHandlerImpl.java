package com.xiaozhao.blog.handler;

import com.alibaba.fastjson.JSON;
import com.xiaozhao.blog.vo.Result;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.xiaozhao.blog.constant.CommonConst.APPLICATION_JSON;

/**
 * 注销处理
 * @Author: XIAO ZHAO
 * @Date: 2022/5/24 15:58
 */
@Component
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
        httpServletResponse.setContentType(APPLICATION_JSON);
        httpServletResponse.getWriter().write(JSON.toJSONString(Result.ok()));
    }

}
