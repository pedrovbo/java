package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
 * entre eles.
 * Ex:
 * Digite um valor: 8
 * Digite outro valor: 5
 * A soma entre 8 e 5 é igual a 13.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num1, num2;

        System.out.print("Type a number: ");
        num1 = reader.nextInt();
        System.out.println();
        System.out.print("Type another number: ");
        num2 = reader.nextInt();

        System.out.println();
        System.out.println("The Sum of this two number is: " + (num1 + num2));
        reader.close();

    }
}
