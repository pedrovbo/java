package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um algoritmo que leia o valor inicial da contagem, o valor final e o 
incremento, mostrando em seguida todos os valores no intervalo: 
Ex: Digite o primeiro Valor: 3 
Digite o último Valor: 10 
Digite o incremento: 2 
Contagem: 3 5 7 9 Acabou!
 */
public class Exercise44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorInicial, incremento, valorFinal;

        System.out.println("Digite o primeiro valor: ");
        valorInicial = in.nextInt();
        System.out.println("Digite o ultimo valor: ");
        valorFinal = in.nextInt();
        System.out.println("Digite o incremento: ");
        incremento = in.nextInt();

        while(valorInicial < valorFinal){
            
            System.out.print(valorInicial + " ");
            
            valorInicial += incremento;
        }

        System.out.print("Acabou!");
        in.close();
        
    }
    
}
