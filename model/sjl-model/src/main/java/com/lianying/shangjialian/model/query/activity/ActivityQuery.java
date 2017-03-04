package com.lianying.shangjialian.model.query.activity;

import com.lianying.shangjialian.model.query.BaseQuery;

/**
 * Created by luowen on 2017/2/21.
 */
public class ActivityQuery extends BaseQuery{
    private Integer id;

    private String title;

    private String keyword;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ActivityQuery{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", keyword='" + keyword + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
