package com.lianying.shangjialian.web.controller.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by luowen on 2017/2/18.
 */
@Controller
@RequestMapping(value = "/logout")
public class LogoutController {

    @RequestMapping
    public String logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        // get authentication object
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null) {
            new SecurityContextLogoutHandler().logout(httpServletRequest, httpServletResponse, auth); // logout
        }
        return "redirect:/login?logout";
    }
}
