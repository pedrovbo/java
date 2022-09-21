package com.gft.programas;

import com.gft.exercicio3.model.Guerreiro;
import com.gft.exercicio3.model.Mago;
import com.gft.exercicio3.model.Personagem;

public interface Exercicio3 {

	public static void start() {
		
		inicioPrograma();
		
		try {
			Mago mago = new Mago();
			mago.setNome("Gandalf");
			mago.setForca(1);
			mago.setInteligencia(4);
			mago.setLevel(1);
			mago.setMana(10);
			mago.setVida(15);
			mago.attack();
			mago.aprenderMagia("Bola de fogo");
			System.out.println(mago.getMagia() + "\n\n");
			
			Mago mago2 = new Mago();
			mago2.setNome("Saruman");
			mago2.setForca(1);
			mago2.setInteligencia(4);
			mago2.setLevel(1);
			mago2.setMana(9);
			mago2.setVida(13);
			mago2.attack();
			mago2.aprenderMagia("Dardos místicos");
			System.out.println(mago2.getMagia() + "\n\n");
			

			Guerreiro guerreiro = new Guerreiro();
			guerreiro.setNome("Conan");
			guerreiro.setForca(3);
			guerreiro.setInteligencia(1);
			guerreiro.setLevel(1);
			guerreiro.setMana(4);
			guerreiro.setVida(30);
			guerreiro.attack();		
			guerreiro.aprenderHabilidade("Ataque giratório");
			System.out.println(guerreiro.getHabilidade() + "\n\n");
			
			Personagem.imprimirQuantidadePersonagens();
		} catch (Exception e) {
			imprimirExcecaoParaUsuario(e);
		}
		fimPrograma();

	}

	static void imprimeLinha() {
		for (int i = 0; i < 80; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	private static void imprimirExcecaoParaUsuario(Exception e) {
		divisorConsole();
		System.out.println(e.getMessage());
		divisorConsole();
	}

	private static void divisorConsole() {
		System.out.println("####################################");
	}

	private static void inicioPrograma() {
		System.out.println("###### INICIO DO EXERCÍCIO 3 #######");
		System.out.println("####################################");
		System.out.println();
	}

	private static void fimPrograma() {
		System.out.println("####### FIM DO EXERCÍCIO 3 ########");
		System.out.println("###################################");
		System.out.println();
	}
}
