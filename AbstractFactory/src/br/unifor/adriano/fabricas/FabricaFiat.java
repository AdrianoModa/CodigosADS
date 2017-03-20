package br.unifor.adriano.fabricas;

import br.unifor.adriano.carros.Palio;
import br.unifor.adriano.carros.Siena;
import br.unifor.adriano.interfaces.CarroPopular;
import br.unifor.adriano.interfaces.CarroSedan;
import br.unifor.adriano.interfaces.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro{

	@Override
	public CarroSedan criarCarroSedan() {
		return new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}

}
