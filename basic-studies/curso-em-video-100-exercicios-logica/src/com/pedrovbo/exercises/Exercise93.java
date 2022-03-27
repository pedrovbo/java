package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que tenha um procedimento chamado Contador() que recebe 
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O 
programa principal deve solicitar a digitação desses valores e passá-los ao 
procedimento, que vai mostrar a contagem na tela. 
 
Ex: Para os valores de início (4), fim (20) e incremento(3) teremos 
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM 
 */
public class Exercise93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inicio, fim, incremento;
        System.out.print("Digite o numero inicial: ");
        inicio = in.nextInt();
        System.out.print("Digite o numero final: ");
        fim = in.nextInt();
        System.out.print("Digite o incrementador: ");
        incremento = in.nextInt();

        Contador(inicio, fim, incremento);

        in.close();
        
    }

    static void Contador(int inicio, int fim, int incremento){
        System.out.println();
        for (int i = inicio; i < fim; i+= incremento) {
            System.out.print(i + " >> ");
        }
        System.out.print("FIM");
    }
}
