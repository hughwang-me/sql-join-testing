package com.com.sqljointesting.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class UserFull {
    private BigDecimal id;

    private String name;

    private String sex;

    private String number;

    private String address;

    private PostInfo postInfo;

    private List<FamilyInfo> familyInfos;
}
