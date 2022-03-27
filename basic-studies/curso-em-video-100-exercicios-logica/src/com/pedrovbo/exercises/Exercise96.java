package com.pedrovbo.exercises;

/**
 * Crie um programa que tenha uma função Media(), que vai receber as 2 notas de 
um aluno e retornar a sua média para o programa principal.
 */
public class Exercise96 {
    public static void main(String[] args) {
        
        System.out.println("Media: " + Media(6, 8));
        
    }

    static float Media(float nota1, float nota2){
        return (nota1+nota2)/2;
    }
}
