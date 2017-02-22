package com.lianying.shangjialian.dal.dao.impl.industry;

import com.lianying.shangjialian.dal.dao.BaseDao;
import com.lianying.shangjialian.dal.dao.impl.BaseDaoImpl;
import com.lianying.shangjialian.dal.dao.industry.IndustryDao;
import com.lianying.shangjialian.dal.mapper.BaseMapper;
import com.lianying.shangjialian.dal.mapper.industry.IndustryMapper;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.query.BaseQuery;
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

    @Override
    public List<IndustryDO> queryByPage(BaseQuery baseQuery) {
        return industryMapper.queryByPage(baseQuery);
    }

    @Override
    public Integer count(BaseQuery baseQuery) {
        return industryMapper.count(baseQuery);
    }
}
