package com.gft.exercicio3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	public Mago() {
	}

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.magia = magia;
	}

	private List<String> magia = new ArrayList<String>();

	@Override
	public void lvlUp() {
		this.setLevel(this.getLevel() + 1);
		this.setForca(this.getForca() + 1);
		this.setInteligencia(this.getInteligencia() + 3);
		this.setMana(this.getMana() + 3);
		this.setVida(this.getVida() + 5);
	}
	
	//TODO como testar esse metodo? Testei apenas o modificador
	public void attack() {
		Random rand = new Random();
		int numeroRandomico = rand.nextInt(301);
		int ataque = (this.getInteligencia() * this.getLevel()) + numeroRandomico;
		System.out.println("O mago " + this.getNome() + " conjurou uma magia e seu ataque foi de " + ataque + ".");
	}

	public void aprenderMagia(String magia) {
		System.out.println(this.getNome() + " aprendeu a magia " + magia + ".");
		this.magia.add(magia);

	}

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}

	public String getMagiaPeloNome(String magia) {
		String magiaEncontrada = null;
		for (String string : this.magia) {
			if (string.contains(magia)) {
				magiaEncontrada = magia;
			}
		}
		return magiaEncontrada;
	}

}
