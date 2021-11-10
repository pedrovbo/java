package com.dio;

import com.dio.base.Order;
import java.math.BigDecimal;

public class MyFirstProgram {

    public static void main(String[] args) {
        Order order = new Order("code1234", new BigDecimal(200.00));
        System.out.println(order);

    }

}