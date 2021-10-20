package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;
import br.com.caelum.contas.modelo.Secretaria;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		// podemos chamar métodos do Funcionario
		gerente.setNome("Gordon Rams");
		gerente.setSenha(4321);
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());
		
		// teste de controle de bonificações
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000.0);
		controle.registra(funcionario2);
	
		System.out.println(controle.getTotalDeBonificacoes());
		
		// teste secretaria
		
		Secretaria secretaria = new Secretaria();
		secretaria.setSalario(2000.0);
		secretaria.setMatricula(30021);
		secretaria.setSetor("Escritorio");
		secretaria.setCpf("9000000000");
		secretaria.setNome("Maria");
		
		System.out.println(secretaria.getBonificacao());
		
		System.out.println(secretaria.getNome() + " " + secretaria.getCpf() + " " + secretaria.getMatricula() + " "  + secretaria.getSalario() + " "  + secretaria.getSetor() + " "  + secretaria.getBonificacao());
	}

}
