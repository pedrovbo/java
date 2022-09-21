package com.gft.exercicio3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	public Guerreiro() {
	}

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level,
			List<String> habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.habilidade = habilidade;
	}

	private List<String> habilidade = new ArrayList<String>();

	@Override
	public void lvlUp() {
		this.setLevel(this.getLevel() + 1);
		this.setForca(this.getForca() + 3);
		this.setInteligencia(this.getInteligencia() + 1);
		this.setMana(this.getMana() + 1);
		this.setVida(this.getVida() + 10);
	}

	// TODO como testar esse metodo? Testei apenas o modificador
	public void attack() {
		Random rand = new Random();
		int numeroRandomico = rand.nextInt(301);
		int ataque = (this.getForca() * this.getLevel()) + numeroRandomico;
		System.out.println("O guerreiro " + this.getNome() + " ergueu sua espada e seu ataque foi de " + ataque + ".");
	}

	public void aprenderHabilidade(String habilidade) {
		System.out.println(this.getNome() + " aprendeu a habilidade " + habilidade + ".");
		this.habilidade.add(habilidade);
	}

	public String getHabilidadePeloNome(String habilidade) {
		String habilidadeEncontrada = null;
		for (String string : this.habilidade) {
			if (string.contains(habilidade)) {
				habilidadeEncontrada = habilidade;
			}
		}
		return habilidadeEncontrada;
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}

}
