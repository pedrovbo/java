package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto
 */
public class Exercise23 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String name, gender;
        double totalPurchases;

        System.out.println("Enter your name: ");
        name = reader.next();
        System.out.println("Enter your gender: ");
        gender = reader.next();
        System.out.println("Enter total purchases: ");
        totalPurchases = reader.nextDouble();

        if(gender.toUpperCase().contentEquals("WOMAN")){
            totalPurchases *= 0.87;
            System.out.println("The client " + name + " is a " + gender + " and she had 13% discount, totaling US$" + totalPurchases + " in purchases...");
        } else if (gender.toUpperCase().contentEquals("MAN")){
            totalPurchases *= 0.95;
            System.out.println("The client " + name + " is a " + gender + " and he had 5% discount, totaling US$" + totalPurchases + " in purchases...");
        }

        
        
        reader.close();
        
    }
}
