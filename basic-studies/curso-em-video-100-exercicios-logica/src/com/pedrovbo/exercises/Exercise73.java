package com.pedrovbo.exercises;

/**
 * Crie um programa que preencha automaticamente (usando lógica, não apenas
 * atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
 * 
 * 9 8 7 6 5 4 3 2 1 0
 * 0 1 2 3 4 5 6 7 8 9
 */
public class Exercise73 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int aux = 9;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aux;
            System.out.print(numeros[i] + " ");
            aux--;

        }

    }
}
