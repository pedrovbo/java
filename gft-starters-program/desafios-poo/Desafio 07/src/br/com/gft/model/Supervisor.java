package br.com.gft.model;

public class Supervisor extends Funcionario {
	
	public Supervisor() {
		super();
	}

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return this.getSalario() + 5000.00d;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nCargo: Supervisor " + "\nBonificação: "
				+ this.bonificacao() + "\n";
	}
	
	
}
