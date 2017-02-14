package com.lianying.shangjialian.model.dto.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by luowen on 2017/2/15.
 */
public class UserRO implements Serializable{

    private static final long serialVersionUID = 7401930365048110440L;

    private Integer id;

    private String name;

    private String mobile;

    private Date expiredAt;

    public UserRO() {
    }

    public UserRO(Integer id, String name, String mobile, Date expiredAt) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.expiredAt = expiredAt;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", expiredAt=" + expiredAt +
                '}';
    }
}
