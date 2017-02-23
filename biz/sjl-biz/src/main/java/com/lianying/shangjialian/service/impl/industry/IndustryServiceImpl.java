package com.lianying.shangjialian.service.impl.industry;

import com.lianying.shangjialian.dal.dao.industry.IndustryDao;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.service.industry.IndustryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luowen on 2017/2/22.
 */
@Service("industryService")
public class IndustryServiceImpl implements IndustryService{

    @Autowired
    private IndustryDao industryDao;


    public List<IndustryRO> queryIndustry(BaseQuery baseQuery) {
        List<IndustryRO> resp = new ArrayList<IndustryRO>();
        List<IndustryDO> resultList = industryDao.queryByPage(baseQuery);

        for (IndustryDO industryDO : resultList) {
            IndustryRO industryRO = new IndustryRO();
            BeanUtils.copyProperties(industryDO, industryRO);
            resp.add(industryRO);
        }
        return resp;
    }

    public Integer insert(IndustryDO industryDO) {
        return industryDao.insert(industryDO);
    }
}
