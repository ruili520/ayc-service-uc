package com.ayc.service.uc.configs;

import com.ayc.framework.common.ICode;

public enum UserBizCode implements ICode {

    USER_LOGIN_FAILED("903001","用户登陆失败"),
    USER_IS_NOT_EXIST("903002", "用户不存在"),
    USER_PASS_ERROR("903003","用户名或密码错误"),
    NAME_IS_NOEXIST("903004","用户名存在"),
    MOBILE_IS_NOEXIST("903005","手机号已存在"),
    ;

    private final String code;
    private String message;
    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    UserBizCode(String code, String message){
        this.code = code;
        this.message = message;
    }
}
