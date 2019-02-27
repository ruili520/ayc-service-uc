package com.ayc.service.uc.entity;

import java.io.Serializable;
import java.util.Date;

public class AycUserEntity implements Serializable {

    private static final long serialVersionUID = 7621542439004843980L;

    private Integer id;

    private String name;

    private String province;

    private String city;

    private String ip;

    private String avatar;

    private String unnid;

    private String openid;

    private Date createdAt;

    private String wechat;

    private Integer viewCount;

    private Integer likeCount;

    private String mobile;

    private Byte sex;

    private String salt;

    private String password;

    private AycUserDetailEntity aycUserDetailEntity;

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
        this.name = name == null ? null : name.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getUnnid() {
        return unnid;
    }

    public void setUnnid(String unnid) {
        this.unnid = unnid == null ? null : unnid.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public AycUserDetailEntity getAycUserDetailEntity() {
        return aycUserDetailEntity;
    }

    public void setAycUserDetailEntity(AycUserDetailEntity aycUserDetailEntity) {
        this.aycUserDetailEntity = aycUserDetailEntity;
    }
}