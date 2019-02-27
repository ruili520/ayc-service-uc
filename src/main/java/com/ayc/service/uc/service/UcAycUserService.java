package com.ayc.service.uc.service;


import com.ayc.service.uc.dto.AycUserRegisterDto;
import com.ayc.service.uc.dto.SelectUserDto;
import com.ayc.service.uc.entity.AycUserEntity;



/**
 * Author:  wwb
 * Date:  2019/2/1814:43
 * Description:用户相关服务
 */
public interface UcAycUserService {

    /**
     * 注册用户
     * @param rCashId
     * @param aycUserRegisterDto
     * @param
     * @return
     */
    AycUserEntity registerUser(Integer rCashId, AycUserRegisterDto aycUserRegisterDto);


    /**
     * 通过手机号查找用户
     * @param rCashId
     * @param
     * @return
     */
    AycUserEntity selectUserByMobile(Integer rCashId, String mobile);

    /**
     * 通过用户名查找用户
     * @param rCashId
     * @param selectUserDto
     * @return
     */
    AycUserEntity SelectByUserName(Integer rCashId, SelectUserDto selectUserDto);

    /**
     * 通过用户名查找用户
     * @param rCashId
     * @param selectUserDto
     * @return
     */
    AycUserEntity SelectByOpenId(Integer rCashId, SelectUserDto selectUserDto);

}
