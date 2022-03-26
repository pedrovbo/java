package com.pedrovbo.exercises;

/**
 * Faça um programa que mostre os 10 primeiros elementos da Sequência 
de Fibonacci: 
1 1 2 3 5 8 13 21...
 */
public class Exercise70 {
    public static void main(String[] args) {
        int fib1 = 1, fib2 = 0, aux;

        for (int i = 0; i < 10; i++) {
            System.out.print(fib1 + " ");
            aux = fib1;
            fib1 += fib2;
            fib2 = aux;
        }
    }
}
