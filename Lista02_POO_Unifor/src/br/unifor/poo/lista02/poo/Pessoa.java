package br.unifor.poo.lista02.poo;
/* 1) Escreva um código em Java que apresente a classe Pessoa, com atributos
nome, endereco e telefone e, o método imprimir. O método imprimir deve
mostrar na tela os valores de todos os atributos.*/
import java.util.Scanner; 

public class Pessoa {
	// Método Imprimir()
	public String imprimir(String nome, String endereco, String telefone){
		
		return nome + "\n" + endereco + "\n" + telefone;
	}

	public static void main(String[] args) {		
		
		Scanner entrada = new Scanner(System.in);
		
		// Atributos da Classe
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("Entre com seu Nome: ");
		nome = entrada.nextLine();
		System.out.println("Entre com seu Endereço: ");
		endereco = entrada.nextLine();
		System.out.println("Entre com seu Telefone: ");
		telefone = entrada.nextLine();
		
		// Instanciando objeto e armazenando método numa variável
		Pessoa dados = new Pessoa();		
		String imprime = dados.imprimir(nome,endereco,telefone);
		
		System.out.println("\nDados:\n" + imprime + " ");

	}
}