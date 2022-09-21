package br.com.gft.main;

import br.com.gft.model.Guerreiro;
import br.com.gft.model.Mago;
import br.com.gft.model.Personagem;

public class Main {

	public static void main(String[] args) {

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
		
		Personagem.quantidadePersonagens();
	}

}
