package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroSedan;

public class Polo implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Polo\nF�brica: Volks\nCategoria: Sedan\n");
	}

}
