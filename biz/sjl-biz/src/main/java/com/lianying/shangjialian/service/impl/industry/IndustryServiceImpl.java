package com.lianying.shangjialian.service.impl.industry;

import com.lianying.shangjialian.dal.dao.industry.IndustryDao;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.model.query.Sort;
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

        List<Sort> sorts = new ArrayList<Sort>();
        sorts.add(new Sort("created_at", Sort.SortType.DESC));
        System.out.println("hello ->"+sorts);
        baseQuery.setSorts(sorts);

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

    /**
     * query industry by id;
     *
     * @param id
     * @return industryRO
     */
    public IndustryRO queryById(Integer id) {
        IndustryDO industryDO = industryDao.queryById(id);
        if(industryDO == null) {
            throw new RuntimeException("不存在");
        }
        IndustryRO industryRO = new IndustryRO();
        BeanUtils.copyProperties(industryDO, industryRO);
        return industryRO;
    }

    public void update(IndustryDO industryDO) {
        industryDao.update(industryDO);
    }

    public void deleteById(Integer id) {
        industryDao.deleteById(id);
    }
}
