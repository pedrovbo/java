package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
 * para ela:
 * Ex:
 * Qual é o seu nome? João da Silva
 * Olá João da Silva, é um prazer te conhecer!
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String pessoa;

        System.out.print("Type your name: ");
        pessoa = reader.next();

        System.out.println("Welcome, " + pessoa);

        reader.close();

    }
}
