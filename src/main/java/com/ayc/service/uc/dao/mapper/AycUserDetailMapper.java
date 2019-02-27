package com.ayc.service.uc.dao.mapper;

import com.ayc.framework.dao.IBaseMapper;
import com.ayc.service.uc.entity.AycUserDetailEntity;

public interface AycUserDetailMapper extends IBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AycUserDetailEntity record);

    int registerUser(AycUserDetailEntity record);

    AycUserDetailEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AycUserDetailEntity record);

    int updateByPrimaryKey(AycUserDetailEntity record);

    /**
     * 通过实体中的字段获取整个实体
     * @param userParams
     * @return
     */
    AycUserDetailEntity selectByEntity(AycUserDetailEntity userParams);

    /**
     * 根据用户名改变用户余额
     * @param record
     * @return
     */
    int updateByUid(AycUserDetailEntity record);
}