package com.tan.forfun.utils;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args){
        BigDecimal bigDecimal1 = new BigDecimal("2.136").setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal bigDecimal2 = new BigDecimal("2.14").setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal1.compareTo(bigDecimal2)==0);
    }
}
