package com.exercises.loops;

import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e
a sua senha e não aceite a senha igual ao nome do
usuário, mostrando uma mensagem de erro e voltando
a pedir as informações.
*/
public class Exercise_2 {
    public static void main(String[] args) {
        String usuario, senha;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu nome de usuário: ");
        usuario = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leia.nextLine();

        while (usuario.contentEquals(senha)) {
            System.out.println("A senha não pode ser igual ao nome do usuário, escolha outra senha!");
            senha = leia.nextLine();
        }

        System.out.println("Fim do Programa");
    }
}
