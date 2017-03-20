package br.unifor.adriano.carros;

import br.unifor.adriano.interfaces.Carro;

public class Fiesta implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Fiesta\nFabricante: Ford\n");
	}
}
