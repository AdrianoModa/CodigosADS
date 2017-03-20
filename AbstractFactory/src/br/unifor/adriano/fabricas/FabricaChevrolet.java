package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Celta;
import br.unifor.adriano.carros.Cruze;
import br.unifor.adriano.interfaces.CarroPopular;
import br.unifor.adriano.interfaces.CarroSedan;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaChevrolet implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new Cruze();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Celta();
	}

}
