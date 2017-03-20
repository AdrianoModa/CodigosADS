package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Gol;
import br.unifor.adriano.carros.Polo;
import br.unifor.adriano.interfaces.CarroPopular;
import br.unifor.adriano.interfaces.CarroSedan;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaVolkswagen implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new Polo();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Gol();
	}
	
}
