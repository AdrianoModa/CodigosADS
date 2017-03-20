package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Celta;
import br.unifor.adriano.interfaces.Carro;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaChevrolet implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Celta();
	}
}
