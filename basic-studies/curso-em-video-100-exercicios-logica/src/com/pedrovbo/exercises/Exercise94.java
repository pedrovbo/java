package com.pedrovbo.exercises;

/**
 * [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado 
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos 
termos da sequência serão mostrados na tela. O seu procedimento deve receber 
esse valor e mostrar a quantidade de elementos solicitados. 
Obs: Use os exercícios 70 e 75 para te ajudar na solução 
Ex:  
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM 
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
 */
public class Exercise94 {
    public static void main(String[] args) {
        Fibonacci(5);
        Fibonacci(9);
    }

    static void Fibonacci(int termos){

        int aux = 0, fib1 = 1, fib2 = 0;
        System.out.println();
        for (int i = 0; i < termos; i++) {
            System.out.print(fib1 + " >> ");
            aux = fib1;
            fib1 += fib2;
            fib2 = aux;
        }
        System.out.print("FIM\n");
        
    }
}
