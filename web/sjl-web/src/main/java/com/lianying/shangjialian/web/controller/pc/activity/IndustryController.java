package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.common.utils.RespUtils;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.activity.IndustryQuery;
import com.lianying.shangjialian.service.industry.IndustryService;
import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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


    @GetMapping(value = "/update/{id}")
    public String update(@PathVariable Integer id, Model model) {
        IndustryRO industryRO = industryService.queryById(id);
        model.addAttribute("industry", industryRO);
        return getViewPath("industryUpdate");
    }

    @PostMapping(value = "/update/{id}")
    @ResponseBody
    public Map<String, Object> update(@PathVariable Integer id, HttpServletRequest httpServletRequest) {

        System.out.println(httpServletRequest);

        String name = httpServletRequest.getParameter("name");

        IndustryDO industryDO = new IndustryDO();
        industryDO.setId(id);
        industryDO.setName(name);
        industryDO.setUpdatedAt(new Date());

        System.out.println(industryDO);

        industryService.update(industryDO);

        return RespUtils.success("修改成功", null);
    }

    @PostMapping(value = "/delete/{id}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable Integer id) {
        try {
            industryService.deleteById(id);
            return RespUtils.success("删除成功", null);
        } catch (RuntimeException e) {
            return  RespUtils.error("删除失败", e);
        }
    }


    @Override
    protected String getSubViewPath() {
        return subViewPath;
    }
}
