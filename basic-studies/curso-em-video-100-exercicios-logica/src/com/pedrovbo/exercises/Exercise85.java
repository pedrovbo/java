package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e 
guarde esses dados em três vetores. No final, mostre uma listagem contendo 
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
 */
public class Exercise85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nome = new String[2];
        String[] sexo = new String[2];
        float[] salario = new float[2];

        for (int i = 0; i < salario.length; i++) {
            System.out.print("Digite seu nome: ");
            nome[i] = in.next().toUpperCase();
            System.out.print("Digite seu sexo(M/F): ");
            sexo[i] = in.next().toUpperCase();
            System.out.print("Digite seu salario: ");
            salario[i] = in.nextFloat();
        }
        System.out.println();
        System.out.println("Mulheres que ganham mais de R$5.000,00: ");
        for (int i = 0; i < salario.length; i++) {
            if(sexo[i].toUpperCase().contentEquals("F") && salario[i] > 5000f)
                System.out.println("Nome: " + nome[i] + "\tSexo: " + sexo[i] + "\t\tSalario: " + salario[i]);
            
        }

        in.close();
    }
}
