package com.com.sqljointesting.dao;

import com.com.sqljointesting.entity.FamilyInfo;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

@Mapper
public interface FamilyInfoMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(FamilyInfo record);

    int insertSelective(FamilyInfo record);

    FamilyInfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(FamilyInfo record);

    int updateByPrimaryKey(FamilyInfo record);
}
