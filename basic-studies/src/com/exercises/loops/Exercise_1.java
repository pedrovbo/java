package com.exercises.loops;

import java.util.Scanner;

/*
* Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido e continue
* pedindo até que o usuário informe um valor válido.
 */
public class Exercise_1 {
    public static void main(String[] args) {
        int nota;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digita sua nota: ");
        nota = leia.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Valor inválido, digite a nota novamente: ");
            nota = leia.nextInt();
        }
        leia.close();
        System.out.println("Fim do Programa");
    }




}
