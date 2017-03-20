package br.unifor.adriano.cliente;

import br.unifor.adriano.fabricas.FabricaChevrolet;
import br.unifor.adriano.fabricas.FabricaFiat;
import br.unifor.adriano.fabricas.FabricaFord;
import br.unifor.adriano.fabricas.FabricaVolkswagen;

public class Clientes {
	public static void main(String[] args) {
		
		
		// Criação dos Carros e exibindo sua Informações
		FabricaFiat fiat1 = new FabricaFiat();
		fiat1.criarCarroPopular().exibirInfoPopular();
		fiat1.criarCarroSedan().exibirInfoSedan();
		
		FabricaChevrolet chev1 = new FabricaChevrolet();
		chev1.criarCarroPopular().exibirInfoPopular();
		chev1.criarCarroSedan().exibirInfoSedan();
		
		FabricaFord ford1 = new FabricaFord();
		ford1.criarCarroPopular().exibirInfoPopular();
		ford1.criarCarroSedan().exibirInfoSedan();
		
		FabricaVolkswagen volks1 = new FabricaVolkswagen();
		volks1.criarCarroPopular().exibirInfoPopular();
		volks1.criarCarroSedan().exibirInfoSedan();
		
	}
}
