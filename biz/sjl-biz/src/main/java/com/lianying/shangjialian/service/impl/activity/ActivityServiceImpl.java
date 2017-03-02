package com.lianying.shangjialian.service.impl.activity;

import com.lianying.shangjialian.dal.dao.activity.ActivityDao;
import com.lianying.shangjialian.model.dataobject.activity.ActivityDO;
import com.lianying.shangjialian.model.dto.activity.ActivityRO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.model.query.activity.ActivityQuery;
import com.lianying.shangjialian.service.activity.ActivityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luowen on 2017/3/1.
 */
@Service("activityDao")
public class ActivityServiceImpl implements ActivityService{

    @Autowired
    private ActivityDao activityDao;

    public List<ActivityRO> queryByPage(ActivityQuery baseQuery) {

        List<ActivityRO> list = new ArrayList<ActivityRO>();
        List<ActivityDO> activityDOList = activityDao.queryByPage(baseQuery);

        if(activityDOList != null && activityDOList.size() > 0) {
            for (ActivityDO activityDO : activityDOList) {
                ActivityRO activityRO = new ActivityRO();
                BeanUtils.copyProperties(activityDO, activityRO);
                list.add(activityRO);
            }
        }
        return  list;
    }

    public void offShelfById(Integer id) {
        ActivityDO activityDO = activityDao.queryById(id);
        if(activityDO != null) {
            activityDO.setIsOffshelf(activityDO.getIsOffshelf() > 0 ? 0 : 1);
            activityDao.update(activityDO);
        } else {
            throw new RuntimeException("数据不存在");
        }
    }

    public void recommandById(Integer id) {
        ActivityDO activityDO = activityDao.queryById(id);
        if(activityDO != null) {
            activityDO.setIsRecommend(activityDO.getIsRecommend() > 0 ? 0 : 1);
        }
    }

    public void update(ActivityRO activityRO) {
        ActivityDO activityDO = new ActivityDO();
        activityDao.update(activityDO);
    }
}
