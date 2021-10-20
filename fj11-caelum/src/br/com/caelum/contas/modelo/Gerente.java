package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario { // a keyword extends faz com que Gerente receba/herde
											// todos os atributos e métodos da classe Funcionario

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}

	}

	// métodos

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	// o metodo a seguir fará um override no metodo bonificacao da
	// superclasse(classe mãe Funcionario)
	// haja vista que a bonificacao para gerente é diferente do funcionario

	/*
	 * @Override // anotação para indicar que um método herdado da Superclasse, foi
	 * sobrescrito // por um método específico. public double getBonificacao() {
	 * return this.salario * 0.15; }
	 */
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000; // a keyword super indica que estamos utilizando
												// o metódo da superclasse(classe mãe)
	}

	
	
}
