package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Uma empresa precisa reajustar o salário dos seus funcionários, dando um 
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, 
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. 
No final, mostre o seu novo salário, baseado na tabela a seguir: 
 
- Mulheres 
  - menos de 15 anos de empresa: +5% 
  - de 15 até 20 anos de empresa: +12% 
  - mais de 20 anos de empresa: +23% 
- Homens 
  - menos de 20 anos de empresa: +3% 
  - de 20 até 30 anos de empresa: +13% 
  - mais de 30 anos de empresa: +25% 
 */
public class Exercise37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salarioAtual;
        String genero;
        int anosTrabalhando;

        System.out.println("Digite seu salario atual: ");
        salarioAtual = in.nextDouble();
        System.out.println("Digite seu genero: MASCULINO/FEMININO");
        genero = in.next();
        System.out.println("Quantos anos trabalhando na empresa? ");
        anosTrabalhando =  in.nextInt();

        if(genero.toUpperCase().contentEquals("FEMININO")){
          if(anosTrabalhando < 15){
            System.out.println("Seu salario atualizado R$ " +  (salarioAtual*1.05d));
          } else if(anosTrabalhando >= 15 && anosTrabalhando <= 20){
            System.out.println("Seu salario atualizado R$ " +  (salarioAtual*1.12d));
          } else if(anosTrabalhando > 20){
            System.out.println("Seu salario atualizado R$ " +  (salarioAtual*1.23d));
          }
        } else if (genero.toUpperCase().contentEquals("MASCULINO")){
          if(anosTrabalhando < 20){
            System.out.println("Seu salario atualizado R$ " +  (salarioAtual*1.03d));
          } else if(anosTrabalhando >= 20 && anosTrabalhando <= 30){
            System.out.println("Seu salario atualizado R$ " +  (salarioAtual*1.13d));
          } else if(anosTrabalhando > 30){
            System.out.println("Seu salario atualizado R$ " +  (salarioAtual*1.25d));
          }
        }

        in.close();
    }
}
