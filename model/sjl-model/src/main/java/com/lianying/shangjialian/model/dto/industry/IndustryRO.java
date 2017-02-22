package com.lianying.shangjialian.model.dto.industry;

import com.lianying.shangjialian.model.dto.BaseRO;

import java.io.Serializable;

/**
 * Created by luowen on 2017/2/22.
 */
public class IndustryRO extends BaseRO implements Serializable{

    private static final long serialVersionUID = -3051893981444624702L;

    private Integer id;

    private String name;

    private Integer parentId;

    public IndustryRO() {
    }

    public IndustryRO(String name, Integer parentId) {
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
        return "IndustryRO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
