package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia o preço de um produto, calcule e mostre o seu
 * PREÇO PROMOCIONAL, com 5% de desconto.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double preco;

        System.out.println("Enter the product value: ");
        preco = reader.nextDouble();
        System.out.println("The product with 5% discount costs: " + (preco * 0.95));
        reader.close();


    }
}
