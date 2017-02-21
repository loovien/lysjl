package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowen on 2017/2/21.
 */
@Controller
@RequestMapping(value = "/activity")
public class ActivityManageController extends PcBaseController{

    protected static String subViewPath = "activity/";

    @RequestMapping(value = "/manage")
    public String manage() {
        return getViewPath("manage");
    }

    @Override
    protected String getSubViewPath() {
        return subViewPath;
    }
}
