package com.exercises.loops;

import java.util.Scanner;

/*
* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
* Ex.: 5!= 120 (5x4x3x2x1)
* */
public class Exercise_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador;
        int numero;

        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        contador = numero;
        System.out.print(numero + "! = ");

        do{
            --contador;
            numero = contador * numero;

        } while (contador > 1);
        
        System.out.println(numero);
    }
}
