package br.unifor.poo.lista02.poo.ex3e4;

import java.util.Scanner;

public class Quadrado {
	
	public float calculaArea(float lado){
		return lado * lado;
	}
	
	public float calculaPerimetro(float lado){
		return 4 * lado;
	}
	
	public static void main(String[] args) {
		
		Scanner valorLado = new Scanner(System.in);
				
		float lado;
		float area;
		float perimetro;
				
		System.out.println("Entre com um Valor do Lado do Quadrado: ");
		lado = valorLado.nextFloat();
		
		Quadrado calcArea = new Quadrado();
		area = calcArea.calculaArea(lado);
		perimetro = calcArea.calculaPerimetro(lado);
		
		System.out.println("A Area do Quadrado = " + area);
		System.out.println("O Perimetro do Quadrado = " + perimetro);
	}
}
