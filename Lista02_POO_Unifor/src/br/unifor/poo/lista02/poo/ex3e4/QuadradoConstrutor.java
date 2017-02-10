package br.unifor.poo.lista02.poo.ex3e4;

public class QuadradoConstrutor {
	
	float lado;
	float area;
	float perimetro;
	
	public QuadradoConstrutor(float lado) {
		super();
		this.lado = lado;
	}
	
	void imprimir(){
		
		System.out.println("A Area do Quadrado = " + this.lado*lado);
		System.out.println("O Perimetro do Quadrado = " + this.lado*4);
	}
}
