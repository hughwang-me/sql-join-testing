package com.com.sqljointesting.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class PostInfo {
    private BigDecimal id;

    private String postName;

    private String title;

    private String number;
}