package com.lianying.shangjialian.model.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by luowen on 2017/2/21.
 */
public class BaseQuery {

    private static final Integer defaultPageSize = 20;

    private Integer pageSize;

    private Integer pageNo;

    private Integer startRow;

    private List<Sort> sorts = new ArrayList<Sort>();


    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public BaseQuery() {
    }

    public BaseQuery(Integer pageSize, Integer pageNo) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
        this.startRow = (pageNo - 1) * pageSize;
    }

    public static Integer getDefaultPageSize() {
        return defaultPageSize;
    }

    public Integer getPageSize() {
        if(pageSize == null || pageSize < 1) {
            return  defaultPageSize;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public List<Sort> getSorts() {
        return sorts;
    }

    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

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

    @Override
    public String toString() {
        return "BaseQuery{" +
                "pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                ", startRow=" + startRow +
                ", sorts=" + sorts +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}
