
package com.ayc.service.uc.service;

import com.ayc.service.uc.dto.AycUserDetailDto;
import com.ayc.service.uc.entity.AycUserDetailEntity;
import com.ayc.service.uc.dto.AycUserRegisterDto;

/**
 * 用户详情服务层
 *
 * @author wwq
 * @version 1.0
 * @createDate 2019/2/19 15:10
 */
public interface UcAycUserDetailService {

    /**
     * 通过用户id验证用户是否为作者
     * @param rCashId
     * @param uid
     * @return
     */
    boolean getUserIsAuthor(Integer rCashId, Integer uid);

    /**
     * 注册用户，添加用户详情信息
     * @param rCashId
     * @param aycUserRegisterDto
     * @return
     */
    AycUserDetailEntity registerUser(Integer rCashId, AycUserRegisterDto aycUserRegisterDto);

    void updateBalance(Integer rCashId, AycUserDetailDto aycUserDetailDto);

    /**
     * 根据用户id更改用户余额
     * @return
     */
    int updateByUid(Integer rCashId, AycUserDetailEntity aycUserDetailEntity);
}