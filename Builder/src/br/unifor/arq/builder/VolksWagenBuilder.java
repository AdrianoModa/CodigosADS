package br.unifor.arq.builder;

public class VolksWagenBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 42000;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "Flex";
	}

	@Override
	public void buildAnoDeFabrica() {
		carro.anoDeFabricacao = 2014;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Jetta";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Volkswagen";
	}

}
