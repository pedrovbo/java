package br.com.gft.model;

public abstract class Personagem {
	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int level;
	static int quantidadePersonagens=0;
	
	public Personagem() {
		quantidadePersonagens++;
	}
	
	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {		
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level; 
		quantidadePersonagens++;
	}

	public static void quantidadePersonagens() {
		System.out.println("Existem " + quantidadePersonagens +  " personagens criados.");
	}
	
	public void lvlUp() {
		this.setLevel(this.getLevel()+1);
		this.setForca(this.getForca()+1);
		this.setInteligencia(this.getInteligencia()+1);
		this.setMana(this.getMana()+1);
		this.setVida(this.getVida()+5);		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
