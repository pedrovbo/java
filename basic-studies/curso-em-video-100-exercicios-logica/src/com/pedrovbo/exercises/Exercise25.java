package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.
 */
public class Exercise25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float a, b, c;

        System.out.println("Enter the size of the first line segment: ");
        a = reader.nextFloat();
        System.out.println("Enter the size of the second line segment: ");
        b = reader.nextFloat();
        System.out.println("Enter the size of the third line segment: ");
        c = reader.nextFloat();

        if(a < (b + c) && b < (c + a) && c < (b + a))
            System.out.println("Could be a triangle!");
        else
            System.out.println("It can't be a triangle");

        reader.close();
    }
}
