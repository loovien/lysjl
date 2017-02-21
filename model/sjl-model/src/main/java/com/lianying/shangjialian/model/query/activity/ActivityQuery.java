package com.lianying.shangjialian.model.query.activity;

import com.lianying.shangjialian.model.query.BaseQuery;

/**
 * Created by luowen on 2017/2/21.
 */
public class ActivityQuery extends BaseQuery{
    private Integer id;

    public ActivityQuery() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
