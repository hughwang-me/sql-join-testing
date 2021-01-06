package com.com.sqljointesting.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import com.com.sqljointesting.entity.FamilyInfo;
import com.com.sqljointesting.dao.FamilyInfoMapper;
@Service
public class FamilyInfoService{

    @Resource
    private FamilyInfoMapper familyInfoMapper;


    public int deleteByPrimaryKey(BigDecimal id) {
        return familyInfoMapper.deleteByPrimaryKey(id);
    }


    public int insert() {
        for (int i = 0; i < 10; i++) {
            FamilyInfo familyInfo = new FamilyInfo();
            familyInfo.setNumber("NO"+String.valueOf(1000 + i));
            familyInfo.setName("男名字" + i);
            familyInfo.setRelationship("父亲" + i);
            familyInfoMapper.insert(familyInfo);
        }
        for (int i = 0; i < 10; i++) {
            FamilyInfo familyInfo = new FamilyInfo();
            familyInfo.setNumber("NO"+String.valueOf(1000 + i));
            familyInfo.setName("女名字" + i);
            familyInfo.setRelationship("母亲" + i);
            familyInfoMapper.insert(familyInfo);
        }
        return 1;
    }


    public int insertSelective(FamilyInfo record) {
        return familyInfoMapper.insertSelective(record);
    }


    public FamilyInfo selectByPrimaryKey(BigDecimal id) {
        return familyInfoMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(FamilyInfo record) {
        return familyInfoMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(FamilyInfo record) {
        return familyInfoMapper.updateByPrimaryKey(record);
    }

}
