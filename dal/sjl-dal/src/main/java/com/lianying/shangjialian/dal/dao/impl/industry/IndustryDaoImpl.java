package com.lianying.shangjialian.dal.dao.impl.industry;

import com.lianying.shangjialian.dal.dao.BaseDao;
import com.lianying.shangjialian.dal.dao.impl.BaseDaoImpl;
import com.lianying.shangjialian.dal.dao.industry.IndustryDao;
import com.lianying.shangjialian.dal.mapper.BaseMapper;
import com.lianying.shangjialian.dal.mapper.industry.IndustryMapper;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.model.query.activity.IndustryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luowen on 2017/2/22.
 */
@Repository("industryDao")
public class IndustryDaoImpl extends BaseDaoImpl<IndustryDO> implements IndustryDao{


    @Autowired
    private IndustryMapper industryMapper;

    @Override
    public BaseMapper<IndustryDO> getMapper() {
        return industryMapper;
    }

    public List<IndustryDO> queryByPage(IndustryQuery baseQuery) {
        return industryMapper.queryByPage(baseQuery);
    }

    @Override
    public <S extends BaseQuery> List<IndustryDO> queryByPage(S baseQuery) {
        return industryMapper.queryByPage(baseQuery);
    }

    @Override
    public Integer insert(IndustryDO entity) {
        System.out.println(entity);
        //return industryMapper.insert(entity);
        return 1;
    }

    @Override
    public Integer count(BaseQuery baseQuery) {
        return industryMapper.count(baseQuery);
    }

}
