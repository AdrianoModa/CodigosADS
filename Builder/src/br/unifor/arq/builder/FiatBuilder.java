package br.unifor.arq.builder;

public class FiatBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 25000;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "Fire Flex";
	}

	@Override
	public void buildAnoDeFabrica() {
		carro.anoDeFabricacao = 2011;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Palio";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Fiat";
	}

}
