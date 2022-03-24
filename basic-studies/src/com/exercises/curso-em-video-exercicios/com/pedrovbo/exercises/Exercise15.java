package com.pedrovbo.exercises;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Crie um programa que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
 * por hora trabalhada.
 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int diasTrabalhados;
        BigDecimal salario = BigDecimal.ZERO;

        System.out.println("Enter the number of days worked: ");
        diasTrabalhados = reader.nextInt();
        salario = BigDecimal.valueOf(diasTrabalhados * (25*8));
        System.out.println("Employee salary is R$ " + salario);
        reader.close();
    }
}
