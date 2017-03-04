package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.common.utils.RespUtils;
import com.lianying.shangjialian.model.dto.activity.ActivityRO;
import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.model.query.activity.IndustryQuery;
import com.lianying.shangjialian.service.activity.ActivityService;
import com.lianying.shangjialian.service.industry.IndustryService;
import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.image.ImageWatched;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luowen on 2017/2/21.
 */
@Controller
@RequestMapping("/activity/general")
public class GeneralController extends PcBaseController{

    protected static String subViewPath = "activity/";

    @Autowired
    private IndustryService industryService;

    @Autowired
    private ActivityService activityService;

    @RequestMapping
    public String index(Model model) {
        BaseQuery industryQuery = new IndustryQuery();
        List<IndustryRO> industries = industryService.queryIndustry(industryQuery);
        model.addAttribute("industries", industries);
        return this.getViewPath("general");
    }

    @PostMapping
    @ResponseBody
    public Map<String, Object> generate(@ModelAttribute ActivityRO activityRO) {
        Integer insertId = activityService.insert(activityRO);
        Map<String, Integer> linkedHashMap =  new LinkedHashMap<String, Integer>();

        return RespUtils.success("创建成功", linkedHashMap);
    }

    @Override
    public String getSubViewPath() {
        return subViewPath;
    }
}
