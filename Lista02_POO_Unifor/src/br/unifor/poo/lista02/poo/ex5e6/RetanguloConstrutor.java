package br.unifor.poo.lista02.poo.ex5e6;

public class RetanguloConstrutor {
	
	float comprimento;
	float area;
	float largura;
	float perimetro;
	
	public RetanguloConstrutor(float area,float perimetro,float comprimento,float largura) {
		super();
		this.area = area;
		this.perimetro = perimetro;
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	void imprimir(){
		System.out.println("A Area do Retangulo: " + this.area);
		System.out.println("O Perimetro do Retangulo: " + this.perimetro);
		System.out.println("A Largura do Retangulo: " + this.comprimento);
		System.out.println("O Comprimento do Retangulo: " + this.largura);		
	}
	
}
