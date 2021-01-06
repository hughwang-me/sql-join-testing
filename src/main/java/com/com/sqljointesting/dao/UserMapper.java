package com.com.sqljointesting.dao;

import com.com.sqljointesting.entity.User;
import com.com.sqljointesting.entity.UserFull;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<UserFull> list(Map<String , Object> parma);
}
