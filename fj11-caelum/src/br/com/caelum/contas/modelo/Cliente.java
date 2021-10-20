package br.com.caelum.contas.modelo;

public class Cliente {
	String nome;
	String endereco;
	
	public String getNome() {
		System.out.println("Nome do cliente: " + this.nome);
		return this.nome; 
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
		
	}
}
