package br.unifor.arq.builder;

public class FordBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 31000;
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
		carro.modelo = "Ford Focus Sedan";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Ford";
	}

}
