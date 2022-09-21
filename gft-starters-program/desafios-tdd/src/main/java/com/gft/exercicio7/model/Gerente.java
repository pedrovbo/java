package com.gft.exercicio7.model;


public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return this.getSalario() + 10000.00d;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nCargo: Gerente " + "\nBonificação: "
				+ this.bonificacao() + "\n";
	}

}
