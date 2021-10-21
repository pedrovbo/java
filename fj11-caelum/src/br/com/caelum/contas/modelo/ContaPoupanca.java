package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta { // fazendo a classe ContaPoupanca herdar tudo de Conta
	
	// o método criado apenas retornará uma String informando o tipo de conta instanciada.
	@Override
	public String getTipo() {
		return super.getTipo()+ "Poupança";
	}
	
}
