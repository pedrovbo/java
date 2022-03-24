package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
 */
public class Exercise20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;

        System.out.println("Enter a number: ");
        number = reader.nextInt();

        if(number % 2 == 0)
            System.out.println("The number is even!");
        else
            System.out.println("The number is odd!");
        
        reader.close();
    }
    
}
