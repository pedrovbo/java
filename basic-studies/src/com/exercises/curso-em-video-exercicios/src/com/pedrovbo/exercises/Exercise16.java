package com.pedrovbo.exercises;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
 * fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
 * já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.
 */
public class Exercise16 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        BigDecimal cigarretePerDay, yearsSmoking, totalCigarretes, totalCigarretesYear;

        System.out.println("How many cigarrettes do you smoke a day? ");
        cigarretePerDay = reader.nextBigDecimal();
        System.out.println("How many years have you smoked? ");
        yearsSmoking = reader.nextBigDecimal();

        totalCigarretesYear = yearsSmoking.multiply(BigDecimal.valueOf(365));
        totalCigarretes = totalCigarretesYear.multiply(cigarretePerDay);

        System.out.println("You have " + ((totalCigarretes.multiply(BigDecimal.valueOf(10))).multiply(BigDecimal.valueOf(0.000694)))  + " days less to live...");
        reader.close();

    }
}
