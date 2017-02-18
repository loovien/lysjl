package com.lianying.shangjialian.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by luowen on 2017/2/16.
 */
public class LoginInterceptor implements HandlerInterceptor{

    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {

        HttpSession session = httpServletRequest.getSession();

        Object userInfo = session.getAttribute("_userinfo");

        System.out.println("preHandle");

        if( userInfo != null && !userInfo.equals(""))
            return true;
        return false;
    }

    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        System.out.println("afterCompletion");

    }
}
