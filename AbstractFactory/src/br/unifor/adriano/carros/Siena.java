package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.CarroSedan;

public class Siena implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria: Sedan\n");
	}

}
