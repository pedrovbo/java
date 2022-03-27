package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Refaça o exercício 90, só que agora em forma de função Somador(), que vai 
receber dois parâmetros e vai retornar o resultado da soma entre eles para o 
programa principal.
 */
public class Exercise95 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Digite o primeiro valor: ");
        numero1 = in.nextInt();
        System.out.print("Digite o segundo valor: ");
        numero2 = in.nextInt();

        System.out.println(Somador(numero1, numero2));
        
        
        in.close();
    }

    static int Somador(int valor1, int valor2){
        return valor1 + valor2;
    }
}
