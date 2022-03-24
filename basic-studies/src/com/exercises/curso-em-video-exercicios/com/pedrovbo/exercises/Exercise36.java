package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Um programa de vida saudável quer dar pontos atividades físicas que podem 
ser trocados por dinheiro. O sistema funciona assim: 
 
   - Cada hora de atividade física no mês vale pontos 
      - até 10h de atividade no mês: ganha 2 pontos por hora 
      - de 10h até 20h de atividade no mês: ganha 5 pontos por hora 
      - acima de 20h de atividade no mês: ganha 10 pontos por hora 
   - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)   
 
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, 
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */
public class Exercise36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horasAtividade = 0, pontos = 0;
        float dinheiro = 0f;

        System.out.println("Quantas horas de atividade? ");
        horasAtividade = in.nextInt();

        if(horasAtividade < 10){
            pontos = 2 * horasAtividade;
        } else if(horasAtividade >= 10 && horasAtividade <= 20){
            pontos = 5 * horasAtividade;
        } else if(horasAtividade > 20){
            pontos = 10 * horasAtividade;
        }

        dinheiro = pontos * 0.05f;

        System.out.println("Quantidade total de pontos: " + pontos);
        System.out.println("Dinheiro conquistado: " + dinheiro);


        
        in.close();
    }
}
