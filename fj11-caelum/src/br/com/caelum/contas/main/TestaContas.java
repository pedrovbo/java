package br.com.caelum.contas.main;

import br.com.caelum.javafx.api.main.TelaDeContas;
import br.com.caelum.javafx.api.util.Evento;

public class TestaContas {

	public static void main(String[] args) {
		TelaDeContas.main(args);
		
	}
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}
	
	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}
	
	
	
	
	
	
}
