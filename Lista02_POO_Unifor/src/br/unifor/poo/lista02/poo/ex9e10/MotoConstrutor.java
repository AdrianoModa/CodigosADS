package br.unifor.poo.lista02.poo.ex9e10;

public class MotoConstrutor {
	
	String marca;
	String modelo;
	String cor;
	Integer cambio;
	
	public MotoConstrutor(String marca, String modelo, String cor, Integer cambio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.cambio = cambio;
	}
	
	void imprimir(){
		
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
	}
	
}
