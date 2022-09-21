package com.gft.programas;

import com.gft.exercicio7.model.Gerente;
import com.gft.exercicio7.model.Supervisor;
import com.gft.exercicio7.model.Vendedor;

public interface Exercicio7 {

	public static void start() {
		inicioPrograma();
		
		try {
			
			Gerente gerente = new Gerente("Maya", 45, 3000d);
			Supervisor supervisor = new Supervisor("Alexa", 38, 2000d);
			Vendedor vendedor = new Vendedor("Hugo", 27, 1500d);
			
			System.out.println("Funcionários: \n" + gerente + supervisor + vendedor);
			
		} catch (Exception e) {
			imprimirExcecaoParaUsuario(e);
		}
		
		fimPrograma();

	}
	
	public static void imprimirExcecaoParaUsuario(Exception e) {
		divisorConsole();
		System.out.println(e.getMessage());
		divisorConsole();
	}

	private static void divisorConsole() {
		System.out.println("####################################");
	}

	private static void inicioPrograma() {
		System.out.println("###### INICIO DO EXERCÍCIO 7 #######");
		System.out.println("####################################");
		System.out.println();
	}

	private static void fimPrograma() {
		System.out.println("####### FIM DO EXERCÍCIO 7 ########");
		System.out.println("###################################");
		System.out.println();
	}
}
