package br.com.gft.model;

public class Vendedor extends Funcionario {
		
	public Vendedor() {
	}

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return this.getSalario() + 3000.00d;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nCargo: Vendedor " + "\nBonificação: "
				+ this.bonificacao() + "\n";
	}
	
	
}
