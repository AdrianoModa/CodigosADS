package br.unifor.arq.builder;

public abstract class CarroBuilder {
	
	protected CarroProduct carro;
	
	public CarroBuilder() {
		carro = new CarroProduct();
	}
	
	public abstract void buildPreco();
	public abstract void buildDscMotor();
	public abstract void buildAnoDeFabrica();
	public abstract void buildModelo();
	public abstract void buildMontadora();
	
	public CarroProduct getCarro(){
		return carro;
	}	
}
