package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
 * na tela a sua média na disciplina.
 * Ex:
 * Nota 1: 4.5
 * Nota 2: 8.5
 * A média entre 4.5 e 8.5 é igual a 6.5
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float grade1, grade2;

        System.out.println("Type the first grade: ");
        grade1 = reader.nextFloat();
        System.out.println("Type the second grade: ");
        grade2 = reader.nextFloat();

        System.out.println("The average between " + grade1 + " and " + grade2 + " is equal to " + ((grade1 + grade2))/2);
        reader.close();


    }
}
