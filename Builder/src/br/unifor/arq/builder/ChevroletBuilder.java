package br.unifor.arq.builder;

public class ChevroletBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 35000;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "1.6 Flex";
	}

	@Override
	public void buildAnoDeFabrica() {
		carro.anoDeFabricacao = 2011;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Cruze";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Chevrolet";
	}

}
