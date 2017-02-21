package com.lianying.shangjialian.web.controller.pc.user;

import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowen on 2017/2/18.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends PcBaseController{

    @RequestMapping
    public String login() {
        return this.getViewPath("login");
    }
}
