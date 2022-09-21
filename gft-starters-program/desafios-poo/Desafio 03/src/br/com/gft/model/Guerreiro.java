package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<String> habilidade = new ArrayList<String>();
	
	@Override
	public void lvlUp() {
		this.setLevel(this.getLevel() + 1);
		this.setForca(this.getForca() + 3);
		this.setInteligencia(this.getInteligencia() + 1);
		this.setMana(this.getMana() + 1);
		this.setVida(this.getVida() + 10);
	}

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

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}

}
