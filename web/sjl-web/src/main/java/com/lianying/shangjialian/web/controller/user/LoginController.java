package com.lianying.shangjialian.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowen on 2017/2/18.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping
    public String login() {
        return "login";
    }
}
