package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	private List<String> magia = new ArrayList<String>();
	
	@Override
	public void lvlUp() {
		this.setLevel(this.getLevel() + 1);
		this.setForca(this.getForca() + 1);
		this.setInteligencia(this.getInteligencia() + 3);
		this.setMana(this.getMana() + 3);
		this.setVida(this.getVida() + 5);
	}

	public void attack() {
		Random rand = new Random();
		int numeroRandomico = rand.nextInt(301);
		int ataque = (this.getInteligencia() * this.getLevel()) + numeroRandomico;
		System.out.println("O mago " + this.getNome() +" conjurou uma magia e seu ataque foi de " + ataque + ".");
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

}
