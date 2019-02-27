package com.ayc.service.uc.service;

import com.ayc.service.uc.dto.SelectUserDto;

/**
 * Author:  wwb
 * Date:  2019/2/2117:40
 * Description:校验用户相关信息的服务
 */
public interface CheckUserInfoService {

    void SelectByMoible(Integer rCashId, SelectUserDto checkUserDto);

    void SelectByUserName(Integer rCashId, SelectUserDto checkUserDto);
}
