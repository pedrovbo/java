package com.gft.programas;

import static com.gft.desafio.repository.ArmaRespository.listaArmas;
import static com.gft.desafio.repository.LocalRepository.listaLocais;
import static com.gft.desafio.repository.SuspeitoRepository.listaSuspeitos;

import java.util.Random;

import com.gft.desafio.model.Crime;
import com.gft.desafio.model.Teoria;
import com.gft.desafio.model.Testemunha;

public interface DesafioDojoPuzzle {

	public static void start() {
		
		Random rand = new Random();
		int contador = 0;
		int assassino = rand.nextInt(6);
		int localDoCrime = rand.nextInt(10);
		int armaUtilizada = rand.nextInt(6);
		boolean isCrimeEmAberto = true;

		Crime crime = geradorDeAleatoriedade(assassino, localDoCrime, armaUtilizada);
		Teoria teoria = new Teoria();
		Testemunha testemunha = new Testemunha();

		System.out.println("Um crime aconteceu... ");
		System.out.println(crime.getAssassino() + " matou a vítima em " + crime.getLocalDoCrime() + " utilizando o(a) " + crime.getArmaUtilizada());
		divisorConsole();
		System.out.println("O Detetive abriu investigação...");
		divisorConsole();
		teoria.chutarCrime(listaSuspeitos(), listaLocais(), listaArmas());

		do {
			System.out.println("Investigando... Tentativa Nº " + contador++);
			
			assassino = rand.nextInt(6);
			localDoCrime = rand.nextInt(10);
			armaUtilizada = rand.nextInt(6);

			switch (testemunha.darTestemunho(crime, teoria)) {
			case 0:
				isCrimeEmAberto = false;
				divisorConsole();
				System.out.println("Crime desvendado!");				
				System.out.println("Assassino: " + teoria.getSuspeito() + "\nLocal do Crime: " + teoria.getLocal() + "\nArma Utilizada: " + teoria.getArma());
				divisorConsole();
				break;

			case 1:
				teoria.chutarSuspeito(listaSuspeitos());
				break;
			case 2:
				teoria.chutarLocal(listaLocais());
				break;
			case 3:
				teoria.chutarArma(listaArmas());
				break;
			default:
				break;
			}

			testemunha.darTestemunho(crime, teoria);

		} while (isCrimeEmAberto);

	}

	private static Crime geradorDeAleatoriedade(int assassino, int localDoCrime, int armaUtilizada) {
		Crime crime = new Crime(listaSuspeitos().get(assassino).toString(), listaLocais().get(localDoCrime).toString(),
				listaArmas().get(armaUtilizada).toString());
		return crime;
	}
	
	private static void divisorConsole() {
		System.out.println("###################################");
	}

}
