package com.pedrovbo.exercises;

import java.util.Random;

/**
 * Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e 
mostre na tela: 
 a) Quais foram os números sorteados 
 b) Quantos números estão acima de 5 
 c) Quantos números são divisíveis por 3
 */
public class Exercise50 {
    public static void main(String[] args) {
        Random rand = new Random();
        int aux = 20, acimaCinco = 0, divisiveisPorTres = 0, numero = 0;
        String sorteados = "Numeros sorteados: ";

        while(aux > 0){

            numero = rand.nextInt(10);            
            sorteados += " " + numero;

            if(numero > 5)
                acimaCinco++;
            

            if(numero % 3 == 0 && numero != 0)
                divisiveisPorTres++;

            aux--;
        }

        System.out.println(sorteados);
        System.out.println(acimaCinco + " numeros acima de 5.");
        System.out.println(divisiveisPorTres + " numeros divisiveis por 3.");

    }
}
