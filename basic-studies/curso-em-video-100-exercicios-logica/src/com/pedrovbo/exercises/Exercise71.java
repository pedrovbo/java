package com.pedrovbo.exercises;

/**
 * Faça um programa que preencha automaticamente um vetor numérico com 8
 * posições, conforme abaixo:
 * 999 999 999 999 999 999 999 999
 * 0 1 2 3 4 5 6 7
 * 
 */
public class Exercise71 {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = 999;

        }
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}
