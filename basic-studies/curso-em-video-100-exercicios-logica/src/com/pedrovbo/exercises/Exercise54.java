package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando 
no final: 
 a) Qual foi a média de altura do grupo 
 b) Quantas pessoas pesam mais de 90Kg 
 c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m 
 d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */
public class Exercise54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float peso, altura, mediaGrupo = 0f ;
        int  aux = 0, maisNoventa = 0, menosCinquenta = 0, maisCem = 0;

        while(aux < 7){
            System.out.print("Digite seu peso: ");
            peso = in.nextFloat();
            System.out.print("Digite sua altura: ");
            altura = in.nextFloat();

            mediaGrupo += altura;

            if(peso > 90){
                maisNoventa++;
            }

            if(peso < 50 && altura < 1.60f){
                menosCinquenta++;
            }

            if(altura > 1.90f && peso > 100){
                maisCem++;
            }
            
            aux++;
        }

        System.out.printf("Media de altura do grupo: %.2f %n", (mediaGrupo/7));
        System.out.println("Pessoas com mais de 90Kg: " + maisNoventa);
        System.out.println("Pessoas com menos de 50Kg e menos de 1.60m: " + menosCinquenta);
        System.out.println("Pessoas com mais de 1.90m e pesam mais de 100Kg: " + maisCem);
        in.close();
    }
}
