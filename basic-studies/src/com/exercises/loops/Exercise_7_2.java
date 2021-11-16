package com.exercises.loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!= 120 (5x4x3x2x1)
 * */
public class Exercise_7_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = ler.nextInt();
        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
