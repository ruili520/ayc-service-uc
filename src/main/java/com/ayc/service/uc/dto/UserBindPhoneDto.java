package com.ayc.service.uc.dto;

public class UserBindPhoneDto {

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 验证码
     */
    private String smsCode;

    /**
     * 密码
     */
    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
