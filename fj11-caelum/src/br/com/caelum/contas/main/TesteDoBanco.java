package br.com.caelum.contas.main;


import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Conta;

public class TesteDoBanco {

	public static void main(String[] args) {
		// com.contas.Banco meuBanco = new com.contas.Banco();
		// meuBanco.nome = "Banco do Brasil";
		Banco meuBanco = new Banco();
		meuBanco.nome = "Banco do Brasil";
		System.out.println(meuBanco.nome);

		Conta conta = new Conta();
		conta.deposita(2000.0);

		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");

		conta.setTitular(cliente.getNome());

		// testando para ver se as duas variáveis estão apontando para o mesmo objeto.

		System.out.println(conta.getTitular() == cliente.getNome());

	}

}
