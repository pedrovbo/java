package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no 
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o 
indivíduo dentro de certas faixas. 
 
   - abaixo de 18.5: Abaixo do peso 
   - entre 18.5 e 25: Peso ideal 
   - entre 25 e 30: Sobrepeso 
   - entre 30 e 40: Obesidade 
   - acima de 40: Obseidade mórbida 
 
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado 
da altura)
 */
public class Exercise34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double altura, peso, IMC;

        System.out.println("Digite seu peso: ");
        peso = in.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = in.nextDouble();

        IMC = peso/Math.pow(altura, 2);

        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        } else if(IMC >= 18.5 && IMC < 25){
            System.out.println("Peso ideal");
        } else if(IMC >= 25 && IMC < 30){
            System.out.println("Sobrepeso");
        } else if(IMC >= 30 && IMC <= 40){
            System.out.println("Obesidade");
        } else if(IMC > 40){
            System.out.println("Obesidade morbida");
        }

        in.close();
    }
}
