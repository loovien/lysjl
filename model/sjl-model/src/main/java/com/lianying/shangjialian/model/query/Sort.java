package com.lianying.shangjialian.model.query;

/**
 * Created by luowen on 2017/2/21.
 */
public class Sort {

    private String columnName;

    private String sortType;

    public Sort() {
    }

    public Sort(String columnName, SortType sortType) {
        this.columnName = columnName;
        this.sortType = sortType.getName();
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public SortType getSortType(String name) {
        for (SortType sortType: SortType.values()) {
            if(sortType.getName().equals(name)) {
                return sortType;
            }
        }
        return null;
    }

    public enum SortType {
        ASC("asc"), DESC("desc");

        private String name;

        SortType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
