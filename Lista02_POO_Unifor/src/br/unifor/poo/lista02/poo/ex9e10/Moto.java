package br.unifor.poo.lista02.poo.ex9e10;

import java.util.Scanner;

public class Moto {
	
	public Integer imprimir(Integer cambio){
		if(cambio == CambioAtual.NEUTRO.getMarcha()){
			System.out.println("Marcha Atual: " + CambioAtual.NEUTRO);
		} else if (cambio == CambioAtual.PRIMEIRA.getMarcha()){
			System.out.println("Marcha Atual: " + CambioAtual.PRIMEIRA);
		} else if (cambio == CambioAtual.SEGUNDA.getMarcha()){
			System.out.println("Marcha Atual: " + CambioAtual.SEGUNDA);
		} else if (cambio == CambioAtual.TERCEIRA.getMarcha()){
			System.out.println("Marcha Atual: " + CambioAtual.TERCEIRA);
		} else if (cambio == CambioAtual.QUARTA.getMarcha()){
			System.out.println("Marcha Atual: " + CambioAtual.QUARTA);
		} else if (cambio == CambioAtual.QUINTA.getMarcha()){
			System.out.println("Marcha Atual: " + CambioAtual.QUINTA);
		}
		return null;
	}
	
	public static void main(String[] args) { 
		
		String marca;
		String modelo;
		String cor;
		Integer cambio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a Marca da Moto: ");
		marca = entrada.nextLine();
		System.out.println("Entre com a Modelo da Moto: ");
		modelo = entrada.nextLine();
		System.out.println("Entre com a Cor da Moto: ");
		cor = entrada.nextLine();
		System.out.println("Entre com a Marcha Atual: ");
		cambio = entrada.nextInt();	
		
		Moto moto = new Moto(); // Instancia o Objeto (Referencia a um Endereço no HEAP)
		
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		moto.imprimir(cambio);
	}
}
