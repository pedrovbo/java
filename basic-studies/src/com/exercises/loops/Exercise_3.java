package com.exercises.loops;
/*Faça um programa que leia e valide as seguintes informações:

Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        Scanner lerString = new Scanner(System.in);
        Scanner lerInt = new Scanner(System.in);
        Scanner lerDouble = new Scanner(System.in);
        Scanner lerChar = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = lerString.nextLine();
        while (nome.length() <= 3){
            System.out.println("Valor inválido. Nome deve conter mais de 3 caracteres! Digite novamente: ");
            nome = lerString.nextLine();
        }

        System.out.println("Digite sua idade: ");
        idade = lerInt.nextInt();
        while (idade < 0 || idade > 150){
            System.out.println("Valor inválido. Idade deve ter valor positivo e menor que 150! Digite novamente: ");
            idade = lerInt.nextInt();
        }
        System.out.println("Digite seu salario: ");
        salario = lerDouble.nextDouble();
        while (salario < 0){
            System.out.println("Valor inválido. O valor do salário deve ser positivo! Digite novamente: ");
            salario = lerDouble.nextDouble();
        }

        System.out.println("Digite seu sexo: ");
        sexo = lerChar.next().toLowerCase().charAt(0);

        while (sexo != 'm' && sexo != 'f'){
            System.out.println("Valor inválido. Sexo deve conter os valores 'm' ou 'f'! Digite novamente: ");
            sexo = lerChar.next().toLowerCase().charAt(0);
        }

        System.out.println("Digite seu estado civil: ");
        estadoCivil = lerChar.next().toLowerCase().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.println(
                    "Valor inválido. Estado Civil deve conter os valores " +
                            "'s', 'c', 'v' ou 'd'! Digite novamente: ");
            estadoCivil = lerChar.next().toLowerCase().charAt(0);
        }

        System.out.println("Seu nome é " + nome + "\nVocê tem " + idade + "\nSeu salário é "
                + salario + "\nVocé é do sexo " + sexo + "\nSeu Estado Civil é " + estadoCivil);

        System.out.println("Fim do Programa");
    }
}
