package com.pedrovbo.exercises;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
 * seu novo salário, com 15% de aumento.
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        BigDecimal salary;

        System.out.println("Enter your salary: ");
        salary = reader.nextBigDecimal();
        System.out.println("Your salary with 15% raise is: " + (salary.multiply(BigDecimal.valueOf(1.15))));
        reader.close();
    }
}
