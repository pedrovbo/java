package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta { // fazendo a classe ContaCorrente herdar tudo de Conta
	
	// o método criado apenas retornará uma String informando o tipo de conta instanciada.
	@Override
	public String getTipo() {
		return super.getTipo() + "Corrente";
	}
	@Override
	public void saca(double valor) {
		this.saldo -= (valor + 0.10);
	}
	
	
}
