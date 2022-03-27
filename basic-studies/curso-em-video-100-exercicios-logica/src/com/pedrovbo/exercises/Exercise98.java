package com.pedrovbo.exercises;

/**
 * Crie um programa que tenha uma função SuperSomador(), que vai receber dois 
números como parâmetro e depois vai retornar a soma de todos os valores no 
intervalo entre os valores recebidos. 
Ex:  
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21 
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
 */
public class Exercise98 {
    public static void main(String[] args) {

        System.out.println(SuperSomador(1, 6));
        System.out.println(SuperSomador(15, 19));

    }

    static int SuperSomador(int inicio, int fim){
        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        return soma; 
    }
}
