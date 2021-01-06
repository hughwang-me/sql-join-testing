package com.com.sqljointesting.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class FamilyInfo {
    private BigDecimal id;

    private String name;

    private String number;

    private String relationship;
}