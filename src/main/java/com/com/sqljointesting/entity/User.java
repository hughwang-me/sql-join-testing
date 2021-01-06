package com.com.sqljointesting.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class User {
    private BigDecimal id;

    private String name;

    private String sex;

    private String number;

    private String address;
}