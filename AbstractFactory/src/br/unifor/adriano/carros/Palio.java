package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroPopular;

public class Palio implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Palio\nF�brica: Fiat\nCategoria: Popular\n");
	}

}
