package br.com.caelum.contas.modelo;

public class Secretaria extends Funcionario {
	private int matricula;
	private String setor;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public static void main(String[] args) {
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
