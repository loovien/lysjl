package com.lianying.shangjialian.web.controller.pc.activity;

import com.lianying.shangjialian.dal.dao.industry.IndustryDao;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.model.query.activity.IndustryQuery;
import com.lianying.shangjialian.web.controller.pc.PcBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by luowen on 2017/2/22.
 *
 */
@Controller
@RequestMapping("/activity/industry")
public class IndustryController extends PcBaseController{

    protected static final String subViewPath = "activity/";

    @Autowired
    private IndustryDao industryDao;

    @RequestMapping
    public String index(@RequestParam(defaultValue = "", required = false) String name, Model model) {

        System.out.println(name);
        IndustryQuery industryQuery = new IndustryQuery(name);
        List<IndustryDO> industries = industryDao.queryByPage(industryQuery);

        model.addAttribute("industries", industries);
        model.addAttribute("name", name);

        return getViewPath("industry");
    }

    @Override
    protected String getSubViewPath() {
        return subViewPath;
    }
}
