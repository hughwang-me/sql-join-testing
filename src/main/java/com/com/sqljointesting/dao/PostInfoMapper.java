package com.com.sqljointesting.dao;

import com.com.sqljointesting.entity.PostInfo;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

@Mapper
public interface PostInfoMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(PostInfo record);

    int insertSelective(PostInfo record);

    PostInfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(PostInfo record);

    int updateByPrimaryKey(PostInfo record);
}
