package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.Carro;

public class Celta implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Celta\nFabricante: Chevrolet\n");
	}

}
