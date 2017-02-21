package com.lianying.shangjialian.dal.dao.impl.activity;

import com.lianying.shangjialian.dal.dao.activity.ActivityDao;
import com.lianying.shangjialian.model.dataobject.activity.ActivityDO;
import com.lianying.shangjialian.model.query.BaseQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by luowen on 2017/2/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class ActivityDaoImplTest {

    @Autowired
    private ActivityDao activityDao;

    @Test
    public void insert() throws Exception {
        ActivityDO activityDo = new ActivityDO();
        activityDo.setTitle("haha");
        activityDo.setDescription("this is a test do builder");
        activityDo.setIndustryId(1);
        activityDo.setBackgroundMusic("http://www.baidu.com/mp3/silent.mp3");
        activityDao.insert(activityDo);
    }

    @Test
    public void queryById() throws Exception {

        ActivityDO result = activityDao.queryById(1);
        System.out.println(result);

    }

    @Test
    public void deleteById() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void queryByPage() {
        BaseQuery baseQuery = new BaseQuery();
        baseQuery.setPageNo(1);
        baseQuery.setPageSize(2);
        List<ActivityDO> result = activityDao.queryByPage(baseQuery);

        System.out.println(result);
    }

}