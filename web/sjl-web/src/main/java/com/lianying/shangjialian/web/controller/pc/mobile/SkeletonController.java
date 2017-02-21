package com.lianying.shangjialian.web.controller.pc.mobile;

import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowen on 2017/2/21.
 */
@Controller
@RequestMapping(value = "/mobile")
public class SkeletonController extends PcBaseController{

    protected static String subViewPath = "mobile/";

    @RequestMapping(value = "/skeleton")
    public String skeleton() {
        return getViewPath("skeleton");
    }

    @Override
    protected String getSubViewPath() {
        return subViewPath;
    }
}
