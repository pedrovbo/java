package com.pedrovbo.exercises;

/**
 * Melhore o exercício 96, criando além da função Media() uma outra função
 * chamada Situacao(), que vai retornar para o programa principal se o aluno
 * está
 * APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
 * parâmetro o resultado retornado pela função Media().
 */
public class Exercise100 {
    public static void main(String[] args) {
        
        int nota1 = 5, nota2 = 9;

        System.out.println("Media: " + Media(nota1, nota2));
        System.out.println("Situacao: " + Situacao(Media(nota1, nota2)));
        
    }

    static float Media(float nota1, float nota2){
        return (nota1+nota2)/2;
    }

    static String Situacao(float media){
        if(media >= 7 && media <= 10)
            return "APROVADO";
        else if(media < 7 && media >= 5)
            return "RECUPERACAO";
        else if(media >= 0 && media < 5)
            return "REPROVADO";
        else
            return "VALOR DE MEDIA INVALIDO";

    }

}
