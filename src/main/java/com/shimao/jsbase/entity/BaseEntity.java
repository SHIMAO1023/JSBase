package com.shimao.jsbase.entity;

import java.sql.Timestamp;
import java.util.Date;

public class BaseEntity {

    private boolean isActive;

    private Date createTime;

    private  Date updateTime;

    void createNew(){
        this.isActive=true;
        this.createTime=new Date();
        this.updateTime=new Date();
    }

}
