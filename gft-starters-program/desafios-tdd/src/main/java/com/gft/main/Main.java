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
					System.out.println("OP��O INV�LIDA");
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
		System.out.println("ESCOLHA UM OP��O:");
		System.out.println("1 - EXERC�CIO 1");
		System.out.println("2 - EXERC�CIO 2");
		System.out.println("3 - EXERC�CIO 3");
		System.out.println("4 - EXERC�CIO DOJO PUZZLE");
		System.out.println("7 - EXERC�CIO 7");
		System.out.println("0 - SAIR");
	}

	private static void divisorTela() {
		System.out.println("###################################");
	}

	private static void inicioPrograma() {
		System.out.println("########## SEJA BEM-VINDO ##########");

	}

	private static void fimPrograma() {
		System.out.println("############ AT� BREVE ############");
	}

}
