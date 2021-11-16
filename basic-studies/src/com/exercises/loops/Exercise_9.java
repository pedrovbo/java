package com.exercises.loops;

import java.util.Scanner;

/*
* Faça um programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas.
* Imprima as consoantes.
*/
public class Exercise_9 {
    public static void main(String[] args) {
        char[] vetorChar = new char[6];
        char teste = 'a';
        int quantidadeConsoantes = 0;

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um caracter: ");
            vetorChar[i] = ler.next().charAt(0);

        }

        System.out.println("Consoantes digitadas: ");
        for (char i: vetorChar
             ) {
            if (!isVogal(i)){
                System.out.print(i + " ");
                quantidadeConsoantes++;
            }
        }
        System.out.println("\nTotal de consoantes digitadas: " + quantidadeConsoantes);

    }

    public static boolean isVogal(char verifica){
        boolean vogal = false;
        char[] vogais = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};

        for (char c: vogais
             ) {
            if (verifica == c){
                vogal = true;
            }
        }
        //System.out.println(vogal);
        return vogal;
    }

}
