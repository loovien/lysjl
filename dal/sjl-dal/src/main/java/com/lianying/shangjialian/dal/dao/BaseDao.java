package com.lianying.shangjialian.dal.dao.user;

/**
 * Created by luowen on 2017/2/14.
 */
public interface BaseDao<T> {

    Integer create(T entity);

    T queryById(Integer id);

    void deleteById(Integer id);

    void  update(T entity);
}
