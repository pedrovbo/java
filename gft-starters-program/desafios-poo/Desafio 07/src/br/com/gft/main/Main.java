package br.com.gft.main;

import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Maya", 45, 3000d);
		Supervisor supervisor = new Supervisor("Alexa", 38, 2000d);
		Vendedor vendedor = new Vendedor("Hugo", 27, 1500d);
		
		System.out.println("Funcionários: \n" + gerente + supervisor + vendedor);
		
		

	}

}
