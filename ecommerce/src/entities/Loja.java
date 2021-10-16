package entities;

public class Loja extends Produtos {
	private String nome = "ZUMBI STORE";
	private String slogan = "ESTILO MANGUE BOY";

	public void getSlogan() {
		System.out.println(slogan + "\n\n");
	}

	public void getNome() {
		System.out.println(nome);
	}


}
