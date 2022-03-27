package com.pedrovbo.exercises;

/**
 * Crie um programa que tenha um procedimento Gerador() que, quando chamado,
 * mostre a mensagem "Olá, Mundo!" com algum componente visual (linhas)
 * Ex: Ao chamar Gerador() aparece:
 * +-------=======------+
 * Olá, Mundo!
 * +-------=======------+
 */
public class Exercise86 {
    public static void main(String[] args) {
        Gerador();
    }

    static void Gerador() {
        System.out.println("+-------=======------+\n  Olá, Mundo!\n+-------=======------+");
    }
}
