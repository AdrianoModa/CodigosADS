package exercicio.construtor.poo;

// Atributos de Carros
public class Carros {
	
	String nome;
	String modelo;
	String cor;
	int portas;
	double aro;
	boolean flex;
	float combustivel;	
	
	// M�todo Construtor de Carros
	
	public Carros(String nome, String modelo, String cor, int portas, double aro, boolean flex, float combustivel) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.portas = portas;
		this.aro = aro;
		this.flex = flex;
		this.combustivel = combustivel;
	}
	
	// M�todos de Carros
	
	public void Abastecer(){
		if(this.combustivel < 10.0){
			System.out.println("Por favor abastecer " + this.nome + " Valor de Combust�vel: " + this.combustivel + " litros");
		}
		else{
			System.out.println("Tanque Abastecido! Valor de Combust�vel: " + this.combustivel + " litros");
		}
	}
		
	// Exibe os atributos de Carros 

	void status(){
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Portas: " + this.portas);
		System.out.println("Aro: " + this.aro);
		System.out.println("Bicombust�vel ? " + this.flex);
		System.out.println("Status Combust�vel: " + this.combustivel);
		//System.out.println("");
	}
}
