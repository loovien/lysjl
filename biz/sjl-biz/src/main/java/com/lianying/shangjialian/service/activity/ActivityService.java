package com.lianying.shangjialian.service.activity;

import com.lianying.shangjialian.dal.dao.activity.ActivityDao;
import com.lianying.shangjialian.model.dto.activity.ActivityRO;
import com.lianying.shangjialian.model.query.activity.ActivityQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by luowen on 2017/3/1.
 */
public interface ActivityService {

    List<ActivityRO> queryByPage(ActivityQuery baseQuery);

    void offShelfById(Integer id);

    void recommandById(Integer id);

    void update(ActivityRO activityRO);
}
