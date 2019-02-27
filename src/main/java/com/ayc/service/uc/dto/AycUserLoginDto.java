package com.ayc.service.uc.dto;

/**
 * Author:  wwb
 * Date:  2019/2/2114:49
 * Description:用户登录的参数实体类
 */
public class AycUserLoginDto {
    private String mobile;

    private String password;

    private String smscode;

    private String openid;

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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
