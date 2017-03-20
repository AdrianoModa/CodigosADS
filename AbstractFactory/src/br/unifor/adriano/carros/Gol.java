package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroPopular;

public class Gol implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Gol\nFábrica: Volks\nCategoria: Popular\n");
	}

}
