package com.lianying.sjl.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowen on 2017/2/10.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping
    public String home() {
        return "home";
    }
}
