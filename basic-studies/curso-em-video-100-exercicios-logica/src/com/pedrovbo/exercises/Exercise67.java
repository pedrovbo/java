package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa usando a estrutura “para” que leia um número inteiro 
positivo e mostre na tela uma contagem de 0 até o valor digitado: 
Ex: Digite um valor: 9 
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
 */
public class Exercise67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numeros;
        System.out.println("Digite o numero desejado: ");
        numeros = in.nextInt();

        for (int i = 0; i <= numeros; i++) {
            if(i!=numeros)
                System.out.print(i + ", ");
            else
                System.out.print(i + " ");
        }

        System.out.println("FIM!");
        in.close();
        
    }
}
