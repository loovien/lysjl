package com.lianying.shangjialian.web.controller.pc.consumer;

import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowen on 2017/2/21.
 */
@Controller
@RequestMapping(value = "/consumer")
public class ConsumerManageController extends PcBaseController{

    protected static String subViewPath = "consumer/";

    @RequestMapping
    public String index() {
        return this.getViewPath("index");
    }

    @Override
    public String getSubViewPath() {
        return subViewPath;
    }
}
