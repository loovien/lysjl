package com.lianying.shangjialian.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by luowen on 2017/2/19.
 */
@Controller
@RequestMapping(value = "/errors")
public class ErrorController {

    private final String errorPath = "/errors/";

    @RequestMapping
    public String errorPage(HttpServletRequest httpServletRequest, Model model) {

        String errorCode = String.valueOf(httpServletRequest.getAttribute("javax.servlet.error.status_code"));
        errorCode = errorCode == null ? "404" : errorCode;

        return this.errorPath + errorCode;
    }
}
