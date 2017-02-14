package com.lianying.shangjialian.dal.mapper;

/**
 * Created by luowen on 2017/2/14.
 */
public interface BaseMapper<T> {
    Integer insert(T entity);

    T queryById(Integer id);

    void deleteById(Integer id);

    void update(T entity);
}
