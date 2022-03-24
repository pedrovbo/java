package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia duas notas de um aluno e calcule a sua média, 
mostrando uma mensagem no final, de acordo com a média atingida: 
   - Média até 4.9: REPROVADO 
   - Média entre 5.0 e 6.9: RECUPERAÇÃO 
   - Média 7.0 ou superior: APROVADO
 */
public class Exercise27 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float grade1, grade2, avarage;

        System.out.println("Enter the first grade: ");
        grade1 = reader.nextFloat();
        System.out.println("Enter the second grade: ");
        grade2 = reader.nextFloat();

        avarage = (grade1 + grade2)/2;

        if(avarage < 5)
            System.out.println("The student failed");
        else if (avarage >= 5 && avarage < 7)
            System.out.println("The student is in recovery");
        else if(avarage >= 7)
            System.out.println("The student is approved");

        reader.close();
    }
}
