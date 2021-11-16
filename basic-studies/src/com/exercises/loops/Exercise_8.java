package com.exercises.loops;

/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 * */
public class Exercise_8 {
    public static void main(String[] args) {
        int[] numeros;
        int contador = 0;
        numeros = new int[]{1, 2, 3, 4, 5, 6};

        for (int i = 5; i >= 0; i--) {
            System.out.printf("\nnumero[%d] = %d\n", i, numeros[i]);
        }

    }
}
