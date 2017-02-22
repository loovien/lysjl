package com.lianying.shangjialian.dal.dao.impl.industry;

import com.lianying.shangjialian.dal.dao.industry.IndustryDao;
import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.query.BaseQuery;
import com.lianying.shangjialian.model.query.activity.IndustryQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by luowen on 2017/2/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class IndustryDaoImplTest {

    @Autowired
    private IndustryDao industryDao;


    @Test
    public void queryByPage() throws Exception {

        BaseQuery baseQuery = new IndustryQuery("教育");
        List<IndustryDO> result = industryDao.queryByPage(baseQuery);
        System.out.println(result);

    }

    @Test
    public void count() throws Exception {
        BaseQuery baseQuery = new IndustryQuery("aaa");
        Integer count = industryDao.count(baseQuery);
        System.out.println(count);
    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void queryById() throws Exception {
        IndustryDO industryDO = industryDao.queryById(1);
        System.out.println(industryDO);
    }

    @Test
    public void deleteById() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

}