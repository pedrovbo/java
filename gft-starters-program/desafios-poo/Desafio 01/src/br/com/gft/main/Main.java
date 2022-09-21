package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {
	public static void main(String[] args) {

		final String ESTA_LIGADO = "Carro está ligado? ";

		Veiculo carro = new Veiculo();
		carro.setCor("Branco");
		carro.setKm(0f);
		carro.setLitrosCombustivel(0);
		carro.setMarca("Volkswagen");
		carro.setModelo("Gol");
		carro.setPlaca("PLC0011");
		carro.setPreco(38000d);
		carro.setVelocidade(0);

		System.out.println("Teste de aceleração:");
		System.out.println("Carro antes de acelerar: " + carro.getVelocidade());
		carro.acelerar();
		System.out.println("Carro depois de acelerar: " + carro.getVelocidade() + "\n\n");

		System.out.println("Teste de abastecimento:");
		System.out.println("Carro antes de abastecer: " + carro.getLitrosCombustivel());
		carro.abastecer(30);
		System.out.println("Carro depois de abastecer: " + carro.getLitrosCombustivel() + "\n\n");

		System.out.println("Teste da validação do limite do tanque de combustível:");
		carro.abastecer(30);
		carro.abastecer(40);

		System.out.println("\n\nTeste de freios:");
		carro.acelerar();
		System.out.println("Carro antes de acionar freios: " + carro.getVelocidade());
		carro.frear();
		System.out.println("Carro após de acionar freios a primeira vez: " + carro.getVelocidade());
		carro.frear();
		System.out.println("Carro após de acionar freios a segunda vez: " + carro.getVelocidade());
		carro.frear();

		System.out.println("\nTeste pintura:");
		System.out.println("Carro antes da pintura: " + carro.getCor());
		carro.pintar("Vermelho");
		System.out.println("Carro após a pintura: " + carro.getCor());

		System.out.println("\n\nTestar ligar:");
		System.out.println(ESTA_LIGADO + carro.isLigado());
		carro.ligar();
		System.out.println(ESTA_LIGADO + carro.isLigado());
		carro.ligar();

		System.out.println("\n\nTestar desligar:");
		System.out.println(ESTA_LIGADO + carro.isLigado());
		carro.desligar();
		System.out.println(ESTA_LIGADO + carro.isLigado());
		carro.desligar();

	}

}
