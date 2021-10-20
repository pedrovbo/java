package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta { // fazendo a classe ContaCorrente herdar tudo de Conta
	
	// o método criado apenas retornará uma String informando o tipo de conta instanciada.
	public String getTipo() {
		return "Conta Corrente";
	}
	
	
}
