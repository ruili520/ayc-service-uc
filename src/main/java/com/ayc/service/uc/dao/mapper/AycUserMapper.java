package com.ayc.service.uc.dao.mapper;

import com.ayc.framework.dao.IBaseMapper;
import com.ayc.service.uc.entity.AycUserEntity;
import org.apache.ibatis.annotations.Param;

public interface AycUserMapper extends IBaseMapper {

    //注册用户
    int registerUser(AycUserEntity aycUserEntity);

    int deleteByPrimaryKey(Integer id);

    int insert(AycUserEntity record);

    AycUserEntity selectByPrimaryKey(Integer id);

    //通过手机号查询用户
    AycUserEntity selectUserByMobile(String mobile);

    AycUserEntity selectByUserName(String name);

    AycUserEntity selectUserByOpenid(String openid);

    //判定首次登陆后绑定ip地址

    int updateIp(AycUserEntity record);

    int updateByPrimaryKeySelective(AycUserEntity record);

    /**
     * 获取用户及用户详情
     * @param uid
     * @return
     */
    AycUserEntity getUserDetail(@Param("id") Integer uid);

    /**
     * 将用户表中可以设置为空的字段设为空
     * @param user
     * @return
     */
    int updateEmptyByPrimaryKeySelective(AycUserEntity user);
}
