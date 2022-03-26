package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Escreva um programa que leia um número qualquer e mostre a tabuada desse
 * número, usando a estrutura “para”.
 * Ex: Digite um valor: 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15 ...
 */
public class Exercise66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        in.close();
    }
}
