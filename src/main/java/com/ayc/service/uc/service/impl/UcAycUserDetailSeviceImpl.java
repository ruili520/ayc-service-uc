
package com.ayc.service.uc.service.impl;

import com.ayc.framework.common.BizCode;
import com.ayc.framework.common.BizException;
import com.ayc.framework.datasource.annotation.DataSource;
import com.ayc.framework.util.DozerUtil;
import com.ayc.service.uc.common.enums.AycUserEnums;
import com.ayc.service.uc.dao.mapper.AycUserDetailMapper;
import com.ayc.service.uc.dto.AycUserDetailDto;
import com.ayc.service.uc.dto.AycUserRegisterDto;
import com.ayc.service.uc.entity.AycUserDetailEntity;
import com.ayc.service.uc.service.UcAycUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户详情服务层实现类
 *
 * @author wwq
 * @version 1.0
 * @createDate 2019/2/19 15:12
 */
@Service("aycUserDetailService")
public class UcAycUserDetailSeviceImpl implements UcAycUserDetailService {

    @Autowired
    private AycUserDetailMapper aycUserDetailMapper;

    @Override
    public boolean getUserIsAuthor(@DataSource(field = "rCashId") Integer rCashId, Integer uid) {
        AycUserDetailEntity userDetail = aycUserDetailMapper.selectByPrimaryKey(uid);

        if (userDetail == null){
            throw new BizException(BizCode.BUSI_ERROR);
        }

        if (userDetail.getType() == AycUserEnums.Types.AUTHOR.getCode()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public AycUserDetailEntity registerUser(@DataSource(field = "rCashId")Integer rCashId, AycUserRegisterDto aycUserRegisterDto) {
        AycUserDetailEntity aycUserDetail = new AycUserDetailEntity();
//        DozerUtil.map(aycUserRegisterDto,aycUserDetail);
        aycUserDetail.setType((byte) 2);
        aycUserDetail.setCreatedAt(new Date());
        aycUserDetail.setCheckTime(new Date());
        aycUserDetail.setUid(aycUserRegisterDto.getUid());
        aycUserDetailMapper.registerUser(aycUserDetail);
        return aycUserDetail;
    }

    @Override
    public void updateBalance(Integer rCashId, AycUserDetailDto aycUserDetailDto) {
        AycUserDetailEntity aycUserDetailEntity = new AycUserDetailEntity();
        DozerUtil.map(aycUserDetailDto,aycUserDetailEntity);
        aycUserDetailMapper.updateByPrimaryKeySelective(aycUserDetailEntity);
    }

    /**
    * @Description: //TODO 根据用户id修改余额
    * @Auther: edward
    * @param: [rCashId, aycUserDetailEntity]
    * @return: int
    * @throws: 
    * @Date: 2019/2/27 10:48
    */
    @Override
    public int updateByUid(Integer rCashId,AycUserDetailEntity aycUserDetailEntity) {
        return aycUserDetailMapper.updateByUid(aycUserDetailEntity);
    }
}