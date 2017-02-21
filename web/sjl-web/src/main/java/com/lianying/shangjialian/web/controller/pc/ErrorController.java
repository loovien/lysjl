package com.lianying.shangjialian.web.controller.pc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by luowen on 2017/2/19.
 */
@Controller
@RequestMapping(value = "/errors")
public class ErrorController extends PcBaseController{

    protected static String subViewPath = "errors/";

    @RequestMapping
    public String errorPage(HttpServletRequest httpServletRequest, Model model) {

        String errorCode = String.valueOf(httpServletRequest.getAttribute("javax.servlet.error.status_code"));
        errorCode = errorCode == null ? "404" : errorCode;

        return this.getViewPath(errorCode);
    }

    @Override
    public String getSubViewPath() {
        return subViewPath;
    }
}
