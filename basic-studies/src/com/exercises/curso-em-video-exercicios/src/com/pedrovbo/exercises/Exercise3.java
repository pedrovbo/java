package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Crie um programa que leia o nome e o salário de um funcionário, mostrando no
 * final uma mensagem.
 * Ex:
 * Nome do Funcionário: Maria do Carmo
 * Salário: 1850,45
 * O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String funcionario;
        double salario;
        System.out.println("Type the employee name: ");
        funcionario = reader.next();
        System.out.println("Type the employee salary: ");
        salario = reader.nextDouble();

        System.out.println("Employee Name: " + funcionario);
        System.out.println("Salary: " + salario);
        System.out.println("The employee " + funcionario + " has a R$" + salario + " salary in June.");
        reader.close();
    }
}
