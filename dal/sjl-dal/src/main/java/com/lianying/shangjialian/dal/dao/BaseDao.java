package com.lianying.shangjialian.dal.dao;

import java.util.List;

/**
 * Created by luowen on 2017/2/14.
 */
public interface BaseDao<T> {

    Integer insert(T entity);

    T queryById(Integer id);

    void deleteById(Integer id);

    void update(T entity);
}
