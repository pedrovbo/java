package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
 * adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi
 * o
 * maior entre eles.
 */
public class Exercise97 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.print("Digite o primeiro valor: ");
        numero1 = in.nextInt();
        System.out.print("Digite o segundo valor: ");
        numero2 = in.nextInt();
        System.out.print("Digite o terceiro valor: ");
        numero3 = in.nextInt();

        System.out.println("Maior numero entre os 3 digitados: " + Maior(numero1, numero2, numero3));
        

        in.close();
    }

    static int Maior(int valor1, int valor2, int valor3) {
        if (valor1 > valor2) {
            if (valor1 > valor3) {
                return valor1;
            } else {
                return valor3;
            }
        } else if (valor1 == valor2 && valor1 == valor3) {
            return 0;
        } else {
            if (valor2 > valor3) {
                return valor2;
            } else {
                return valor3;
            }
        }
    }

}
