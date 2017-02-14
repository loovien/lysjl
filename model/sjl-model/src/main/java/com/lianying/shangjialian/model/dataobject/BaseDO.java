package com.lianying.shangjialian.model.dataobject;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by luowen on 2017/2/14.
 */
public class BaseDO implements Serializable{

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
