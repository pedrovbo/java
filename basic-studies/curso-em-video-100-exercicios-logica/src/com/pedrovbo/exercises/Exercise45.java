package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * O programa acima vai ter um problema quando digitarmos o primeiro valor 
maior que o último. Resolva esse problema com um código que funcione em qualquer 
situação.
 */
public class Exercise45 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int valorInicial, incremento, valorFinal, aux;

        System.out.println("Digite o primeiro valor: ");
        valorInicial = in.nextInt();
        System.out.println("Digite o ultimo valor: ");
        valorFinal = in.nextInt();
        System.out.println("Digite o incremento: ");
        incremento = in.nextInt();

        if(valorInicial > valorFinal){
            aux = valorInicial;
            valorInicial = valorFinal;
            valorFinal = aux;
        }

        while(valorInicial < valorFinal){
            
            System.out.print(valorInicial + " ");
            
            valorInicial += incremento;
        }

        System.out.print("Acabou!");
        in.close();
    }
}
