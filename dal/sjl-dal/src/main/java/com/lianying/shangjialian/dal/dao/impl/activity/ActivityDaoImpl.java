package com.lianying.shangjialian.dal.dao.impl.activity;

import com.lianying.shangjialian.dal.dao.activity.ActivityDao;
import com.lianying.shangjialian.dal.dao.impl.BaseDaoImpl;
import com.lianying.shangjialian.dal.mapper.BaseMapper;
import com.lianying.shangjialian.dal.mapper.activity.ActivityMapper;
import com.lianying.shangjialian.model.dataobject.activity.ActivityDO;
import com.lianying.shangjialian.model.query.BaseQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luowen on 2017/2/21.
 */
@Repository("activityDao")
public class ActivityDaoImpl extends BaseDaoImpl<ActivityDO> implements ActivityDao{

    @Autowired
    private ActivityMapper activityMapper;


    @Override
    public BaseMapper<ActivityDO> getMapper() {
        return activityMapper;
    }

    @Override
    public List<ActivityDO> queryByPage(BaseQuery baseQuery) {
        return activityMapper.queryByPage(baseQuery);
    }

    @Override
    public Integer count(BaseQuery baseQuery) {
        return activityMapper.count(baseQuery);
    }
}
