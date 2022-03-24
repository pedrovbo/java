package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).
 */
public class Exercise19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String name;
        float[] grades = new float[2];

        System.out.println("Enter your name: ");
        name = reader.next();
        System.out.println("Enter your first grade: ");
        grades[0] = reader.nextFloat();
        System.out.println("Enter your second grade: ");
        grades[1] = reader.nextFloat();

        if(((grades[0]+grades[1])/grades.length >= 7))
            System.out.println("The student " + name + " did well!");
        else
            System.out.println("The student " + name + " did not perform well...");

        reader.close();
    }
}
