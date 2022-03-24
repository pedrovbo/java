package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
 * sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;

        System.out.println("Type a number: ");
        number = reader.nextInt();

        System.out.println("The predecessor of " + number + " is " + (number - 1));
        System.out.println("The successor of " + number + " is " + (number + 1));
        reader.close();
    }
}
