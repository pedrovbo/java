package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Escreva um programa para aprovar ou não o empréstimo bancário para a compra 
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e 
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que 
ela não pode exceder 30% do salário ou então o empréstimo será negado. 

 */
public class Exercise33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double valorCasa, salarioComprador, parcela;
        int anosParaPagar;

        System.out.println("Digite o valor da casa: ");
        valorCasa = reader.nextDouble();
        System.out.println("Digite seu salario: ");
        salarioComprador = reader.nextDouble();
        System.out.println("Em quantos anos deseja pagar? ");
        anosParaPagar = reader.nextInt();

        anosParaPagar *= 12; // conversão para meses

        parcela = (valorCasa/anosParaPagar);

        if(parcela <= (salarioComprador * 0.3)){
            System.out.println("Emprestimo aprovado!");
        } else {
            System.out.println("Nao foi possivel realizar o emprestimo...");
        }

        reader.close();


        
    }
}
