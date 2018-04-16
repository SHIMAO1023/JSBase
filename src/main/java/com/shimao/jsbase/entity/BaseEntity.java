package com.shimao.jsbase.entity;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class BaseEntity {

    private boolean isActive;

    private long createTime;

    private long updateTime;

    void createNew() {
        this.isActive = true;
        this.createTime = System.currentTimeMillis();
        this.updateTime = System.currentTimeMillis();
    }

}
