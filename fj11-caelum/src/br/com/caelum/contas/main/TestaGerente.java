package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		// podemos chamar métodos do Funcionario
		gerente.setSenha(4321);
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());
	}

}
