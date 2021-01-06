package com.com.sqljointesting.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import com.com.sqljointesting.dao.PostInfoMapper;
import com.com.sqljointesting.entity.PostInfo;
@Service
public class PostInfoService{

    @Resource
    private PostInfoMapper postInfoMapper;


    public int deleteByPrimaryKey(BigDecimal id) {
        return postInfoMapper.deleteByPrimaryKey(id);
    }


    public int insert() {
        for (int i = 0; i < 5; i++) {
            PostInfo postInfo = new PostInfo();
            postInfo.setNumber("NO"+String.valueOf(1000 + i));
            postInfo.setTitle("职位"+i);
            postInfoMapper.insert(postInfo);
        }
        return 1;
    }


    public int insertSelective(PostInfo record) {
        return postInfoMapper.insertSelective(record);
    }


    public PostInfo selectByPrimaryKey(BigDecimal id) {
        return postInfoMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(PostInfo record) {
        return postInfoMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(PostInfo record) {
        return postInfoMapper.updateByPrimaryKey(record);
    }

}
