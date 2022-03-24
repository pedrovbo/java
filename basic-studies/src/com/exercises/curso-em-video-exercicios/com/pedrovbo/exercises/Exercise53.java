package com.pedrovbo.exercises;

import java.util.Scanner;

/**
 * Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final: 
 a) Quantos homens foram cadastrados 
 b) Quantas mulheres foram cadastradas 
 c) A média de idade do grupo 
 d) A média de idade dos homens 
 e) Quantas mulheres tem mais de 20 anos
 */
public class Exercise53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int[] age = new int[5];
        String[] gender = new String[5];
        int men = 0, women = 0, womenOverTwenty = 0, aux = 0, auxDivisor = 0;
        float avarageAge = 0f, avarageAgeOfMen = 0f;
        
        
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the people ages: ");
            age[i] = reader.nextInt();
                
        }

        for (int j = 0; j < gender.length; j++) {
            System.out.println("Enter the people genders: Man/Woman");
            gender[j] = reader.next();
        }    
                
        for (String _gender : gender) {
            if(_gender.toUpperCase().contentEquals("MAN")){
                men++;
            } else if (_gender.toUpperCase().contentEquals("WOMAN")){
                women++;
            }
        }

        System.out.println("Total of men: " + men);
        System.out.println("Total of women: " + women);

        for (int _age : age) {
            avarageAge += _age;            
        }
        System.out.println("The avarage age for the group is " + (avarageAge/age.length));

        while(aux <= 4){
            if(gender[aux].toUpperCase().contentEquals("MAN")){
                avarageAgeOfMen += age[aux];
                auxDivisor++;
            } else if (gender[aux].toUpperCase().contentEquals("WOMAN")){
                if(age[aux] > 20){
                    womenOverTwenty++;
                }
            }
            aux++;
        }

        System.out.printf("The avarage age of men is: %.1f %n", ((avarageAgeOfMen)/auxDivisor));
        System.out.println("Total of women over twenty is: " + womenOverTwenty);

        reader.close();
    }
}
