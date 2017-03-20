package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.Carro;

public class Palio implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Palio\nFabricante: Fiat\n");
	}

}
