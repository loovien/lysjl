package com.lianying.shangjialian.dal.dao.impl;

import com.lianying.shangjialian.dal.dao.BaseDao;
import com.lianying.shangjialian.dal.mapper.BaseMapper;

/**
 * Created by luowen on 2017/2/14.
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T>{

    public abstract BaseMapper<T> getMapper();

    @Override
    public Integer insert(T entity) {
        return getMapper().insert(entity);
    }

    @Override
    public T queryById(Integer id) {
        return getMapper().queryById(id);
    }

    @Override
    public void deleteById(Integer id) {
        getMapper().deleteById(id);
    }

    @Override
    public void update(T entity) {
        getMapper().update(entity);
    }
}
