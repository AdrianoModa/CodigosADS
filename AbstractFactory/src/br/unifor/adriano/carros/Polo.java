package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroSedan;

public class Polo implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Polo\nFábrica: Volks\nCategoria: Sedan\n");
	}

}
