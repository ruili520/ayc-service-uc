package com.ayc.service.uc.dto;

/**
 * Author:  wwb
 * Date:  2019/2/2117:45
 * Description:校验用户相关信息的参数实体
 */
public class SelectUserDto {

    private String mobile;

    private String userName;

    private String openid;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
