package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Fiesta;
import br.unifor.adriano.interfaces.Carro;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Fiesta();
	}
	
}
