package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroPopular;

public class Fiesta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\nF�brica: Ford\nCategoria: Popular\n");
	}

}
