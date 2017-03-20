package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Palio;
import br.unifor.adriano.interfaces.Carro;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro(){
		return new Palio();
	}

}
