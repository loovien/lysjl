package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.service.industry.IndustryService;
import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by luowen on 2017/2/21.
 */
@Controller
@RequestMapping("/activity/general")
public class GeneralController extends PcBaseController{

    protected static String subViewPath = "activity/";

    @Autowired
    private IndustryService industryService;

    @RequestMapping
    public String index(Model model) {
        List<IndustryRO> industries = industryService.queryIndustry(new BaseQuery());
        model.addAttribute("industries", industries);
        return this.getViewPath("general");
    }

    @Override
    public String getSubViewPath() {
        return subViewPath;
    }
}
