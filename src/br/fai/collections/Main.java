package br.fai.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		Cachorro primeiroCachorro = new Cachorro("Tiburssinho");
		primeiroCachorro.setCor("azul");

		Cachorro segundoCachorro = new Cachorro("Aroldo");

		List<Cachorro> listaDeCachorros = new ArrayList<Cachorro>();
		listaDeCachorros.add(primeiroCachorro);
		listaDeCachorros.add(segundoCachorro);

		for (Cachorro cachorro : listaDeCachorros) {
			cachorro.som();
			cachorro.dizerMeuNome();
			cachorro.oQueGostoDeFazer();

			System.out.println("Cor do cachorro: " + cachorro.getCor());

			System.out.println("---------------------");
		}

		Gato primeiroGato = new Gato();
		primeiroGato.setNome("yoru");
		Gato segundoGato = new Gato("vermelho");
		segundoGato.setNome("Venus");

		List<Gato> listaDeGatos = new ArrayList<Gato>();
		listaDeGatos.add(primeiroGato);
		listaDeGatos.add(segundoGato);

		for (Gato gato : listaDeGatos) {
			gato.som();
			gato.dizerMeuNome();
			gato.oQueFacoDuranteANoite();

			System.out.println("Cor do gato: " + gato.getCor());
			

		}
	}

}
