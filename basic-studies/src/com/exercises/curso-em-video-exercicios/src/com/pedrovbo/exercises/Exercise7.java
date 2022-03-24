package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
 * sua terça parte.
 * Ex:
 * Digite um número: 3.5
 * O dobro de 3.5 é 7.0
 * A terça parte de 3.5 é 1.16666
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float number;

        System.out.println("Type a number: ");
        number = reader.nextFloat();

        System.out.println("The double of " + number + " is  " + (number * 2));
        System.out.println("The " + number + " divided by three is " + (number/3));
        reader.close();
    }
}
