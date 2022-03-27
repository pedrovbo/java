package com.pedrovbo.exercises;

/**
 * Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros 
elementos da sequência de Fibonacci: 
 
1 1 2 3 5 8 13  21  34  55  89  144  233  377  610  987 
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 */
public class Exercise75 {
    public static void main(String[] args) {
        int[] numeros = new int[15];

        int aux = 0, fib1 = 1, fib2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(fib1 + " ");
            aux = fib1;
            fib1 += fib2;
            fib2 = aux; 
        }
    }
}
