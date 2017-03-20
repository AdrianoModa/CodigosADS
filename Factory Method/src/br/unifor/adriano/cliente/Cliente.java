package br.unifor.adriano.cliente;

import br.unifor.adriano.carros.Celta;
import br.unifor.adriano.carros.Fiesta;
import br.unifor.adriano.carros.Gol;
import br.unifor.adriano.carros.Palio;

public class Cliente {
	public static void main(String[] args) {		
		
		// Criando os carros
		Palio palio = new Palio();
		Gol gol = new Gol();
		Fiesta fiesta = new Fiesta();
		Celta celta = new Celta();		
		
		// Exibindo informações do Carro
		System.out.println("<<< Exibir Informações >>>\n");
		palio.exibirInfo();
		gol.exibirInfo();
		fiesta.exibirInfo();
		celta.exibirInfo();		
	}
}
