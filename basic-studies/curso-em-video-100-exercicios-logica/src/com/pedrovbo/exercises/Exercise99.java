package com.pedrovbo.exercises;

/**
 * Faça um programa que possua uma função chamada Potencia(), que vai receber 
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da 
exponenciação. 
Ex: Potencia(5,2) vai calcular 52 = 25
 */
public class Exercise99 {
    public static void main(String[] args) {

        System.out.println(Potencia(5, 2));
        
    }
    static double Potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }
}
