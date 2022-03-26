package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
 * No final, mostre o total de salários pagos aos homens e o total pago às
 * mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
 * sempre que ler os dados de um funcionário.
 */
public class Exercise57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario, totPagoHomens = 0f, totPagoMulheres = 0f;
        String sexo, continua;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite seu salario: ");
            salario = in.nextFloat();
            System.out.println("Digite seu sexo: M/F");
            sexo = in.next();

            if (sexo.toUpperCase().contentEquals("M")) {
                totPagoHomens += salario;
            } else if (sexo.toUpperCase().contentEquals("F")) {
                totPagoMulheres += salario;
            }

            System.out.println("Deseja continuar cadastrando? S/N");
            continua = in.next();
            if(continua.toUpperCase().contentEquals("N")){
                continuar = false;
            }
        }

        System.out.println("Total de salarios pagos aos homens: " + totPagoHomens);
        System.out.println("Total de salarios pagos a mulheres: " + totPagoMulheres);

        in.close();
    }
}
