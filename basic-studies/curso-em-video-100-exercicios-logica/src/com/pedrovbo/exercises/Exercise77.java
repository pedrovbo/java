package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No 
final, mostre uma listagem com todos os nomes informados, na ordem inversa 
daquela em que eles foram informados.
 */
public class Exercise77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = in.next();
        }
        System.out.println("\nOrdem inversa: ");
        for (int i = (nomes.length - 1); i >= 0; i--) {
            System.out.print(nomes[i] + " ");
        }

        in.close();

    }
}
