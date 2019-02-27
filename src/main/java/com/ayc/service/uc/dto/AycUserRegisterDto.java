package com.ayc.service.uc.dto;

import java.util.Date;

/**
 * Author:  wwb
 * Date:  2019/2/1814:21
 * Description:
 */
public class AycUserRegisterDto {

    private String mobile;

    private String password;

    private String smscode;

    private Integer uid;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
