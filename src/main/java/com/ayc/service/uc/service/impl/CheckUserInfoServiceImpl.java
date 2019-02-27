package com.ayc.service.uc.service.impl;

import com.ayc.framework.common.BizException;
import com.ayc.framework.datasource.annotation.DataSource;
import com.ayc.service.uc.dto.SelectUserDto;
import com.ayc.service.uc.configs.UserBizCode;
import com.ayc.service.uc.dao.mapper.AycUserMapper;
import com.ayc.service.uc.entity.AycUserEntity;
import com.ayc.service.uc.service.CheckUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:  wwb
 * Date:  2019/2/2117:46
 * Description:
 */
@Service("checkUserInfoService")
public class CheckUserInfoServiceImpl implements CheckUserInfoService {

    @Autowired
    private AycUserMapper aycUserMapper;

    @Override
    public void SelectByMoible(@DataSource(field = "rCashId") Integer rCashId, SelectUserDto checkUserDto) {
        AycUserEntity aycUserEntity = aycUserMapper.selectUserByMobile(checkUserDto.getMobile());
        if(aycUserEntity != null){
            throw new BizException(UserBizCode.MOBILE_IS_NOEXIST);
        }
    }

    @Override
    public void SelectByUserName(@DataSource(field = "rCashId") Integer rCashId, SelectUserDto checkUserDto) {
        AycUserEntity aycUserEntity = aycUserMapper.selectByUserName(checkUserDto.getUserName());
        if(aycUserEntity != null){
            throw new BizException(UserBizCode.NAME_IS_NOEXIST);
        }
    }
}
