package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
 * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */
public class Exercise9 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double money;

        System.out.println("Enter how much R$ you have: ");
        money = reader.nextDouble();

        System.out.println("You could buy " + (money/3.45) + "US$");
        reader.close();



    }
}
