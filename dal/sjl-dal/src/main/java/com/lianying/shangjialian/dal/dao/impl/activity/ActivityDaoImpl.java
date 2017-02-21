package com.lianying.shangjialian.dal.dao.impl.activity;

import com.lianying.shangjialian.dal.dao.activity.ActivityDao;
import com.lianying.shangjialian.dal.dao.impl.BaseDaoImpl;
import com.lianying.shangjialian.dal.mapper.BaseMapper;
import com.lianying.shangjialian.dal.mapper.activity.ActivityMapper;
import com.lianying.shangjialian.model.dataobject.activity.ActivityDO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by luowen on 2017/2/21.
 */
public class ActivityDaoImpl extends BaseDaoImpl<ActivityDO> implements ActivityDao{

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public Integer insert(ActivityDO entity) {
        return activityMapper.insert(entity);
    }

    @Override
    public void update(ActivityDO entity) {

        activityMapper.update(entity);

    }

    @Override
    public BaseMapper getMapper() {
        return activityMapper;
    }
}
