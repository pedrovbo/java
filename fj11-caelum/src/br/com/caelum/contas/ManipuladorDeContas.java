package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta; // variável conta declarada
	private Evento evento;

	public void criaConta(Evento evento) { // método para criar conta
		this.conta = new Conta(); // variável conta instanciada
		this.conta = new Conta();
		this.conta.setAgencia("1234");
		this.conta.setNumero(56789);
		this.conta.setTitular("Batman");
	}
}
