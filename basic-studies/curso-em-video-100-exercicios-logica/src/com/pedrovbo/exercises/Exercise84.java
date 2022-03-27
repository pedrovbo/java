package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses 
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem 
contendo apenas os dados das pessoas menores de idade.
 */
public class Exercise84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] idade = new int[9];
        String[] nome = new String[9];

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite seu nome: ");
            nome[i] = in.next();
            System.out.print("Digite sua idade: ");
            idade[i] = in.nextInt();            
        }
        System.out.println();
        System.out.println("Menores de idade: ");
        for (int i = 0; i < nome.length; i++) {
            if(idade[i] < 18)
                System.out.println("Nome: " + nome[i] + "\tIdade: " + idade[i]);
        }


        in.close();
    }
}
