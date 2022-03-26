package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
 * “para”. No final, mostre na tela:
 * a) Quantas mulheres foram cadastradas
 * b) Quantos homens pesam mais de 100Kg
 * c) A média de peso entre as mulheres
 * d) O maior peso entre os homens
 */
public class Exercise68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sexo;
        float peso, somaMulher = 0, maiorHomem = 0;
        int contaMulher = 0, maisCem = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o sexo (M/F): ");
            sexo = in.next();
            System.out.print("Digite o peso: ");
            peso = in.nextFloat();

            if(sexo.toUpperCase().contentEquals("F")){
                contaMulher++;
                somaMulher += peso;
            } else if (sexo.toUpperCase().contentEquals("M")){
                if(peso > 100)
                    maisCem++;

                if(peso > maiorHomem)
                    maiorHomem = peso;
            }
        }

        System.out.println("a) Quantas mulheres foram cadastradas: " + contaMulher);
        System.out.println("b) Quantos homens pesam mais de 100Kg: " + maisCem);
        System.out.println("c) A media de peso entre as mulheres: " + (somaMulher/contaMulher));
        System.out.println("d) O maior peso entre os homens: " + maiorHomem);

        in.close();
    }
}
