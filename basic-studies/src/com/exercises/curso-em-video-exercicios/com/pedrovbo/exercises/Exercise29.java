package com.pedrovbo.exercises;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Desenvolva um programa que leia o nome de um funcionário, seu salário, 
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de 
acordo com a tabela a seguir: 
   - Até 3 anos de empresa: aumento de 3% 
   - entre 3 e 10 anos: aumento de 12.5% 
   - 10 anos ou mais: aumento de 20%
 */
public class Exercise29 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String employeeName;
        BigDecimal employeeSalary;
        int yearsWorking;

        System.out.println("Enter the employee name: ");
        employeeName = reader.next();
        System.out.println("Enter the employee salary: ");
        employeeSalary = reader.nextBigDecimal();
        System.out.println("How many years has he been working in the company? ");
        yearsWorking = reader.nextInt();

        if(yearsWorking < 3)
            System.out.println("Employee " + employeeName + " new salary is: " + (employeeSalary.multiply(BigDecimal.valueOf(1.03))));
        else if(yearsWorking >= 3 && yearsWorking < 10)
            System.out.println("Employee " + employeeName + " new salary is: " + (employeeSalary.multiply(BigDecimal.valueOf(1.125))));
        else if(yearsWorking >= 10)
        System.out.println("Employee " + employeeName + " new salary is: " + (employeeSalary.multiply(BigDecimal.valueOf(1.20))));
        reader.close();
    }
}
