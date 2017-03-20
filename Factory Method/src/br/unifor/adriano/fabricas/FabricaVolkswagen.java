package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Gol;
import br.unifor.adriano.interfaces.Carro;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaVolkswagen implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro(){
		return new Gol();
	}
}
