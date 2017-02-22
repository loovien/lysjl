package com.lianying.shangjialian.model.query.activity;

import com.lianying.shangjialian.model.query.BaseQuery;

import java.util.Date;

/**
 * Created by luowen on 2017/2/22.
 */
public class IndustryQuery extends BaseQuery{

    private Integer id;

    private String name;

    private Integer parentId;

    public IndustryQuery() {
    }

    public IndustryQuery(String name) {
        this.name = name;
    }

    public IndustryQuery(Integer pageSize, Integer pageNo, String name) {
        super(pageSize, pageNo);
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
