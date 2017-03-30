package br.unifor.arq.builder;

public class ConcessionariaDirector {
	protected CarroBuilder montadora;
	
	public ConcessionariaDirector(CarroBuilder montadora){
		this.montadora = montadora;
	}
	
	public void construirCarro(){
		montadora.buildPreco();
		montadora.buildAnoDeFabrica();
		montadora.buildDscMotor();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
	
	public CarroProduct getCarro() {
		return montadora.getCarro();
	}
}
