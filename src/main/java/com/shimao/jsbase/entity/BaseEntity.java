package com.shimao.jsbase.entity;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class BaseEntity {

    private boolean isActive;

    private long createTime;

    private long updateTime;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        isActive = isActive;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    void createNew() {
        this.isActive = true;
        this.createTime = System.currentTimeMillis();
        this.updateTime = System.currentTimeMillis();
    }

}
