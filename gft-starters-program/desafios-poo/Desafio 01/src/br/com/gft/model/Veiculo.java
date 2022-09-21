package br.com.gft.model;

public class Veiculo {

	private static final int CAPACIDADE_TANQUE = 60;
	private static final int ACELERACAO = 20;

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;

	public Veiculo() {
	};

	public Veiculo(String marca, String modelo, String placa, String cor, float km, int litrosCombustivel,
			Double preco) {
		this.velocidade = 0;
		this.isLigado = false;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.litrosCombustivel = litrosCombustivel;
		this.preco = preco;
	}

	public void acelerar() {
		this.setVelocidade(this.getVelocidade() + ACELERACAO);
	}

	public void abastecer(int combustivel) {

		if (isTanqueCheio(combustivel)) {

			System.out.println("Não é possível abastecer essa quantidade, limite do tanque é de 60 litros!");

		} else {

			this.setLitrosCombustivel(this.getLitrosCombustivel() + combustivel);

			System.out.println("Abastecimento realizado com sucesso!");
			
		}

	}

	private Boolean isTanqueCheio(int combustivel) {

		if (this.getLitrosCombustivel() + combustivel <= CAPACIDADE_TANQUE) {

			return false;

		}

		return true;
	}

	private Boolean isParado() {

		if (this.getVelocidade() > 0) {

			return false;

		}

		return true;

	}

	private Boolean isVelocidadeMenosAceleracaoMaiorQueZero() {

		if (this.getVelocidade() - ACELERACAO < 0) {

			return false;

		}

		return true;
	}

	public void frear() {

		if (isParado()) {

			System.out.println("Veículo já se encontra parado!");

		} else {

			if (isVelocidadeMenosAceleracaoMaiorQueZero()) {

				this.setVelocidade(this.getVelocidade() - ACELERACAO);

			} else {

				this.setVelocidade(0);

			}

		}
	}

	public void pintar(String cor) {

		this.setCor(cor);

	}

	public void ligar() {

		if (this.isLigado()) {

			System.out.println("Veículo já está ligado!");

		} else {

			this.isLigado = true;

		}
	}

	public void desligar() {

		if (this.isLigado()) {

			this.isLigado = false;

		} else {

			System.out.println("Veículo já está desligado!");

		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + ", km=" + km
				+ ", isLigado=" + isLigado + ", litrosCombustivel=" + litrosCombustivel + ", velocidade=" + velocidade
				+ ", preco=" + preco + "]";
	}

}
