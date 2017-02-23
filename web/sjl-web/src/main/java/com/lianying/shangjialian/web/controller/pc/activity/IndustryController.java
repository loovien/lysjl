package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.common.utils.RespUtils;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.activity.IndustryQuery;
import com.lianying.shangjialian.service.industry.IndustryService;
import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luowen on 2017/2/22.
 *
 */
@Controller
@RequestMapping("/activity/industry")
public class IndustryController extends PcBaseController{

    protected static final String subViewPath = "activity/";

    @Autowired
    private IndustryService industryService;

    @RequestMapping
    public String index(@RequestParam(defaultValue = "", required = false) String name, Model model) {

        IndustryQuery industryQuery = new IndustryQuery(name);
        List<IndustryRO> industries = industryService.queryIndustry(industryQuery);

        model.addAttribute("industries", industries);
        model.addAttribute("name", name);

        return getViewPath("industry");
    }

    @GetMapping(value = "/create")
    public String create() {
        System.out.println("hello world");
        return getViewPath("createIndustry");
    }

    /**
     * create a industry row record
     *
     * @param industryName
     * @return
     */
    @PostMapping(value = "/create")
    @ResponseBody
    public Map<String, Object> create(@RequestParam String industryName) {
        Map<String, Integer> insertIdMap = new HashMap<String, Integer>();

        IndustryDO industryDO = new IndustryDO(industryName, null);
        Integer insertId = industryService.insert(industryDO);
        insertIdMap.put("insertId", insertId);
        return RespUtils.success("创建成功", insertIdMap);
    }

    @Override
    protected String getSubViewPath() {
        return subViewPath;
    }
}
