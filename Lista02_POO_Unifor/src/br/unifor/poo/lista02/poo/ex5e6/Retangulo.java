package br.unifor.poo.lista02.poo.ex5e6;

import java.util.Scanner;

public class Retangulo {
	
	public void imprimir(float comprimento, float area, float largura, float perimetro){
		System.out.println("Comprimento: " + comprimento); 
		System.out.println("Area: " + area);
		System.out.println("Largura: " + largura);
		System.out.println("Perimetro: " + perimetro);
	}
	
	public float calcularArea(float comprimento, float largura){
		return comprimento * largura;
	}	
	public float calcularPerimetro(float comprimento, float largura){
		return (2 * comprimento) + (2 * largura);
	}

	public static void main(String[] args) {

		float comprimento;
		float area;
		float largura;
		float perimetro;		
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Entre com o cumprimento do Retangulo: ");
		comprimento = entradaDados.nextFloat();
		System.out.println("Entre com a largura do Retangulo: ");
		largura = entradaDados.nextFloat();
		
		Retangulo retangulo = new Retangulo();
		area = retangulo.calcularArea(comprimento, largura);
		perimetro = retangulo.calcularPerimetro(comprimento, largura);	
		
		retangulo.imprimir(comprimento,area,largura,perimetro);
	}
}
