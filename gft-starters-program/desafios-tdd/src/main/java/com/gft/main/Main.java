package com.gft.main;

import java.util.Scanner;

import com.gft.programas.DesafioDojoPuzzle;
import com.gft.programas.Exercicio1;
import com.gft.programas.Exercicio2;
import com.gft.programas.Exercicio3;
import com.gft.programas.Exercicio7;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		boolean continuar = true;
		inicioPrograma();
		try {
			do {
				menu();
				opcao = leitor.nextInt();

				switch (opcao) {
				case 1:
					Exercicio1.start();
					break;

				case 2:
					Exercicio2.start();
					break;

				case 3:
					Exercicio3.start();
					break;

				case 4:
					DesafioDojoPuzzle.start();
					break;

				case 7:
					Exercicio7.start();
					break;

				case 0:
					continuar = false;
					break;
				default:
					System.out.println("OPÇÃO INVÁLIDA");
					break;
				}

				divisorTela();

			} while (continuar);
		} catch (Exception e) {
			System.out.println(e);
		}

		leitor.close();
		fimPrograma();

	}

	private static void menu() {
		System.out.println("ESCOLHA UM OPÇÃO:");
		System.out.println("1 - EXERCÍCIO 1");
		System.out.println("2 - EXERCÍCIO 2");
		System.out.println("3 - EXERCÍCIO 3");
		System.out.println("4 - EXERCÍCIO DOJO PUZZLE");
		System.out.println("7 - EXERCÍCIO 7");
		System.out.println("0 - SAIR");
	}

	private static void divisorTela() {
		System.out.println("###################################");
	}

	private static void inicioPrograma() {
		System.out.println("########## SEJA BEM-VINDO ##########");

	}

	private static void fimPrograma() {
		System.out.println("############ ATÉ BREVE ############");
	}

}
