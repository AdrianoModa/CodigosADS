package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Fiesta;
import br.unifor.adriano.carros.Fusion;
import br.unifor.adriano.interfaces.CarroPopular;
import br.unifor.adriano.interfaces.CarroSedan;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new Fusion();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}

}
