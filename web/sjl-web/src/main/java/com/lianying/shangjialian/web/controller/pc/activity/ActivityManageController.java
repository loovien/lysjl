package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.model.dto.activity.ActivityRO;
import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.activity.ActivityQuery;
import com.lianying.shangjialian.service.activity.ActivityService;
import com.lianying.shangjialian.service.industry.IndustryService;
import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luowen on 2017/2/21.
 */
@Controller
@RequestMapping(value = "/activity")
public class ActivityManageController extends PcBaseController{

    protected static String subViewPath = "activity/";

    @Autowired
    private ActivityService activityService;

    @Autowired
    private IndustryService industryService;

    @RequestMapping(value = "/manage")
    public String manage(@ModelAttribute  ActivityQuery activityQuery, Model model) {

        activityQuery.initializeStartRow();

        List<ActivityRO> activityROS = new ArrayList<ActivityRO>();
        List<ActivityRO> activityROList = activityService.queryByPage(activityQuery);
        for (ActivityRO activityRO : activityROList) {
            IndustryRO industryRO = industryService.queryById(activityRO.getIndustryId());
            activityRO.setIndustryRO(industryRO);
            activityROS.add(activityRO);
        }
        System.out.println(activityROS);
        model.addAttribute("activityRos", activityROS);
        return getViewPath("manage");
    }

    @Override
    protected String getSubViewPath() {
        return subViewPath;
    }
}
