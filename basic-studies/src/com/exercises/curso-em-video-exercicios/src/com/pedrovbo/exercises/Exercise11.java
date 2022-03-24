package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
 * segundo grau e mostre o valor de Delta.
 */
public class Exercise11 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        double A, B, C, delta;

        System.out.println("Enter the value of A: ");
        A = reader.nextDouble();
        System.out.println("Enter the value of B: ");
        B = reader.nextDouble();
        System.out.println("Enter the value of C: ");
        C = reader.nextDouble();

        delta = ((Math.pow(B, 2))-4*(A*C));

        System.out.println("Delta value is: " + delta);
        reader.close();


    }
}
