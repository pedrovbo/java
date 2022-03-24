package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais
 */
public class Exercise26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a, b;

        System.out.println("Enter the first value: ");
        a = reader.nextInt();
        System.out.println("Enter the second value: ");
        b = reader.nextInt();

        if(a > b){
            System.out.println("The first value is the greatest!");
        } else if (a == b){
            System.out.println("There's no greatest value, both values are the same!");
        } else if (a < b){
            System.out.println("The second value is the greatest!");
        }

        reader.close();
    }
}
