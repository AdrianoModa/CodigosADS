package br.unifor.poo.lista02.poo.ex9e10;

public enum CambioAtual {
	
	NEUTRO(0), PRIMEIRA(1), SEGUNDA(2), TERCEIRA(3), QUARTA(4), QUINTA(5);
	
	private Integer marcha;
	
	private CambioAtual(Integer marcha){
		this.marcha = marcha; 
	}
	
	public Integer getMarcha(){
		return marcha;
	}

}
