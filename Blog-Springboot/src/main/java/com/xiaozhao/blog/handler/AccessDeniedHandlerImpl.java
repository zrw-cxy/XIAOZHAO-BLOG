package com.xiaozhao.blog.handler;

import com.alibaba.fastjson.JSON;
import com.xiaozhao.blog.vo.Result;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.xiaozhao.blog.constant.CommonConst.APPLICATION_JSON;

/**
 * 用户权限处理
 * @Author: XIAO ZHAO
 * @Date: 2022/5/24 16:01
 */
@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException {
        httpServletResponse.setContentType(APPLICATION_JSON);
        httpServletResponse.getWriter().write(JSON.toJSONString(Result.fail("权限不足")));
    }

}
