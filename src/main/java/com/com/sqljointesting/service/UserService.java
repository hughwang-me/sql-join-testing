package com.com.sqljointesting.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.com.sqljointesting.dao.FamilyInfoMapper;
import com.com.sqljointesting.dao.PostInfoMapper;
import com.com.sqljointesting.dao.UserMapper2;
import com.com.sqljointesting.entity.UserFull;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.com.sqljointesting.dao.UserMapper;
import com.com.sqljointesting.entity.User;
@Service
@Slf4j
public class UserService{

    @Resource
    private UserMapper userMapper;
    @Autowired
    PostInfoMapper postInfoMapper;
    @Autowired
    FamilyInfoMapper familyInfoMapper;

    public int insert() {

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("王欢" + i);
            user.setNumber("NO"+String.valueOf(1000 + i));
            user.setAddress("地址" + i);
            user.setSex("男");
            userMapper.insert(user);
        }

        return 1;
    }

    public void testRun(){
        Map<String , Object> map = new HashMap<>();
        map.put("name" , "王");
        map.put("sex" , "女");

        List<UserFull> users1 = userMapper.list(map);
        log.warn("总数:{}" , users1.size());
        for (UserFull user : users1) {
            log.warn("user -> {}" , JSON.toJSONString(user , SerializerFeature.WriteMapNullValue));
        }

        PageHelper.startPage(1,2);
        log.warn("page handler");
        List<UserFull> users = userMapper.list(map);

        PageInfo<UserFull> pageInfo = new PageInfo<>(users);
        log.warn("pageInfo -> {}" , pageInfo.getTotal());
        log.warn("pageInfo -> {}" , pageInfo.getPages());
        log.warn("pageInfo -> {}" , pageInfo.getNavigatepageNums());
        log.warn("pageInfo -> {}" , JSON.toJSONString(pageInfo));
        for (UserFull user : users) {
            log.warn("user -> {}" , JSON.toJSONString(user , SerializerFeature.WriteMapNullValue));
        }

        PageHelper.startPage(2,2);
        log.warn("page handler");
        List<UserFull> users2 = userMapper.list(map);

        PageInfo<UserFull> pageInfo2 = new PageInfo<>(users);
        log.warn("pageInfo -> {}" , pageInfo2.getTotal());
        log.warn("pageInfo -> {}" , pageInfo2.getPages());
        log.warn("pageInfo -> {}" , pageInfo2.getNavigatepageNums());
        log.warn("pageInfo -> {}" , JSON.toJSONString(pageInfo2));
        for (UserFull user : users2) {
            log.warn("user -> {}" , JSON.toJSONString(user , SerializerFeature.WriteMapNullValue));
        }

        PageHelper.startPage(3,2);
        log.warn("page handler");
        List<UserFull> users3 = userMapper.list(map);

        PageInfo<UserFull> pageInfo3 = new PageInfo<>(users);
        log.warn("pageInfo -> {}" , pageInfo3.getTotal());
        log.warn("pageInfo -> {}" , pageInfo3.getPages());
        log.warn("pageInfo -> {}" , pageInfo3.getNavigatepageNums());
        log.warn("pageInfo -> {}" , JSON.toJSONString(pageInfo3));
        for (UserFull user : users3) {
            log.warn("user -> {}" , JSON.toJSONString(user , SerializerFeature.WriteMapNullValue));
        }
    }


    @Resource
    private UserMapper2 userMapper2;

    public void t2(){
        Map<String , Object> map = new HashMap<>();
        map.put("name" , "王");
        map.put("sex" , "女");
        map.put("relationship" , "父");

        List<UserFull> users1 = userMapper2.list(map);
        log.warn("不分页总数:{}" , users1.size());
        for (UserFull user : users1) {
            log.warn("不分页user -> {}" , JSON.toJSONString(user , SerializerFeature.WriteMapNullValue));
        }

        PageHelper.startPage(1,2);
        log.warn("处理分页 22222222222222222222222222222222222222222222222222r");
        List<UserFull> users = userMapper2.list(map);

        PageInfo<UserFull> pageInfo = new PageInfo<>(users);
        log.warn("pageInfo getTotal -> {}" , pageInfo.getTotal());
        log.warn("pageInfo getPages -> {}" , pageInfo.getPages());
        log.warn("pageInfo getNavigatepageNums -> {}" , pageInfo.getNavigatepageNums());
        log.warn("pageInfo pageInfo -> {}" , JSON.toJSONString(pageInfo));
        for (UserFull user : users) {
            log.warn("处理分页 user -> {}" , JSON.toJSONString(user , SerializerFeature.WriteMapNullValue));
        }
    }
}
