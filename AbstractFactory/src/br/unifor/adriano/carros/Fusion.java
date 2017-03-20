package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroSedan;

public class Fusion implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fusion\nFábrica: Ford\nCategoria: Sedan\n");
	}

}
