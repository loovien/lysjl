package com.lianying.shangjialian.model.dataobject.industry;

import com.lianying.shangjialian.model.dataobject.BaseDO;

/**
 * Created by luowen on 2017/2/22.
 */
public class IndustryDO extends BaseDO{

    private Integer id;

    private String name;

    private Integer parentId;

    public IndustryDO() {
    }

    public IndustryDO(String name, Integer parentId) {
        this.name = name;
        this.parentId = parentId;
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

    @Override
    public String toString() {
        return "IndustryDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
