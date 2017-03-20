package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroPopular;

public class Celta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Celta\nFábrica: Chevrolet\nCategoria: Popular\n");
	}

}
