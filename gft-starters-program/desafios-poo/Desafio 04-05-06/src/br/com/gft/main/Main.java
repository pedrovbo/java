package br.com.gft.main;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.gft.model.Pessoa;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n######################## Desafio 4 ########################\n");
		
		List<Pessoa> pessoas = new LinkedList<Pessoa>();
		pessoas.add(new Pessoa("João", 15));
		pessoas.add(new Pessoa("Leandro", 21));
		pessoas.add(new Pessoa("Paulo", 17));
		pessoas.add(new Pessoa("Jessica", 18));

		System.out.println("Nome \t\tIdade\n");
		pessoas.forEach(pessoa -> {
			System.out.println(pessoa);
		});

		System.out.println("\n");

		Map<String, Integer> pessoaMap = pessoas.stream().collect(Collectors.toMap(Pessoa::getNome, Pessoa::getIdade));

		for (Map.Entry<String, Integer> entry : pessoaMap.entrySet()) {
			int max = Collections.max(pessoaMap.values());
			if (entry.getValue() == max) {
				System.out.println("Nome da pessoa mais velha é " + entry.getKey());
			}
		}

		System.out.println("\n######################## Desafio 5 ########################\n");

		System.out.println("Quantidade de pessoas na lista antes da exclusão: " + pessoas.size());

		Iterator<Pessoa> it = pessoas.iterator();
		while (it.hasNext()) {
			int idade = (int) it.next().getIdade();
			if (idade < 18) {
				it.remove();
			}
		}

		System.out.println("Quantidade de pessoas na lista depois da exclusão: " + pessoas.size());

		System.out.println("\n######################## Desafio 6 ########################\n");

		for (Pessoa i : pessoas) {
			if (i.getNome().contentEquals("Jessica")) {
				System.out.println("Esta pessoa existe e sua idade é " + i.getIdade());
			}
		}
	}

}
