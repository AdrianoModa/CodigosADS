package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroSedan;

public class Cruze implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Cruze\nF�brica: Chevrolet\nCategoria: Sedan\n");
	}

}
