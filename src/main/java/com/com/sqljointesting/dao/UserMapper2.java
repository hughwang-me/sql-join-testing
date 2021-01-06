package com.com.sqljointesting.dao;

import com.com.sqljointesting.entity.User;
import com.com.sqljointesting.entity.UserFull;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper2 {
    List<UserFull> list(Map<String , Object> param);
}
