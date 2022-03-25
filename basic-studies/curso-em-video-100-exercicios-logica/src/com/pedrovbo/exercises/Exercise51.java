package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela 
    qual foi o maior e qual foi o menor preço digitados.
 */
public class Exercise51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float preco, maior = 0, menor = 0, aux = 0;

        while(aux < 8){

            System.out.print("Digite o valor do produto: ");
            preco = in.nextFloat();
            if(preco > maior)
                maior = preco;
            if(menor == 0 || preco < menor)
                menor = preco;
            
            aux++;
        }

        System.out.println("Menor preco: " + menor);
        System.out.println("Maior preco: " + maior);
        
        in.close();
    }
}
