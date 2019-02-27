package com.ayc.service.uc.service.impl;


import com.ayc.framework.common.BizException;
import com.ayc.framework.datasource.annotation.DataSource;
import com.ayc.framework.redis.RedisUtil;
import com.ayc.framework.util.DozerUtil;
import com.ayc.framework.util.MD5Utils;
import com.ayc.framework.util.RandomUntil;
import com.ayc.service.uc.configs.UserBizCode;
import com.ayc.service.uc.dao.mapper.AycUserDetailMapper;
import com.ayc.service.uc.dao.mapper.AycUserMapper;
import com.ayc.service.uc.dto.AycUserRegisterDto;
import com.ayc.service.uc.dto.SelectUserDto;
import com.ayc.service.uc.entity.AycUserEntity;
import com.ayc.service.uc.service.UcAycUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Author:  wwb
 * Date:  2019/2/1814:44
 * Description:用户中心服务
 */
@Service("ucAycUserService")
public class UcAycUserServiceImpl implements UcAycUserService {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private AycUserMapper aycUserMapper;
    @Autowired
    private AycUserDetailMapper aycUserDetailMapper;

    @Override
    public AycUserEntity registerUser(@DataSource(field = "rCashId")Integer rCashId, AycUserRegisterDto aycUserRegisterDto) {
        AycUserEntity aycUserEntity = new AycUserEntity();
        DozerUtil.map(aycUserRegisterDto,aycUserEntity);
        aycUserEntity.setSalt(RandomUntil.saltCode());
        aycUserEntity.setPassword(MD5Utils.MD5(MD5Utils.MD5(aycUserRegisterDto.getPassword()+aycUserEntity.getSalt())));
        aycUserEntity.setAvatar("/");
        aycUserEntity.setCreatedAt(new Date());
        aycUserMapper.registerUser(aycUserEntity);
        return aycUserEntity;
    }

    @Override
    public AycUserEntity selectUserByMobile(@DataSource(field = "rCashId")Integer rCashId, String mobile) {
        AycUserEntity aycUserEntity = aycUserMapper.selectUserByMobile(mobile);
        if(aycUserEntity == null){
            throw new BizException(UserBizCode.USER_IS_NOT_EXIST);
        }
        return aycUserEntity;
    }

    @Override
    public AycUserEntity SelectByUserName(@DataSource(field = "rCashId")Integer rCashId, SelectUserDto selectUserDto) {
        AycUserEntity aycUserEntity = aycUserMapper.selectUserByMobile(selectUserDto.getUserName());
        if(aycUserEntity == null){
            throw new BizException(UserBizCode.USER_IS_NOT_EXIST);
        }
        return aycUserEntity;
    }

    @Override
    public AycUserEntity SelectByOpenId(@DataSource(field = "rCashId")Integer rCashId, SelectUserDto selectUserDto) {
        AycUserEntity aycUserEntity = aycUserMapper.selectUserByMobile(selectUserDto.getOpenid());
        if(aycUserEntity == null){
            throw new BizException(UserBizCode.USER_IS_NOT_EXIST);
        }
        return aycUserEntity;
    }


}
