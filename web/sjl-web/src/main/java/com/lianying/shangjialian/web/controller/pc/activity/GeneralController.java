package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowen on 2017/2/21.
 */
@Controller
@RequestMapping("/activity/general")
public class GeneralController extends PcBaseController{

    protected static String subViewPath = "activity/";

    @RequestMapping
    public String index() {
        return this.getViewPath("general");
    }

    @Override
    public String getSubViewPath() {
        return subViewPath;
    }
}
