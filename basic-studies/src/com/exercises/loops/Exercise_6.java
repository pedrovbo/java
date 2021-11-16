package com.exercises.loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 *
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */

public class Exercise_6 {
    public static void main(String[] args) {
        int numero, multiplicador;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 10 para gerarmos a tabuada:");
        numero = ler.nextInt();

        for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        }

    }
}
