package br.unifor.poo.lista02.poo;

public class PessoaConstrutor {
	
	String nome;
	String endereco;
	String telefone;
	
	public PessoaConstrutor(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	void status(){
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Telefone: " + this.telefone + "\n");
	}
}
