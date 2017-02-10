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
	
	// Método Construtor de Carros
	
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
	
	// Métodos de Carros
	
	public void Abastecer(){
		if(this.combustivel < 10.0){
			System.out.println("Por favor abastecer " + this.nome + " Valor de Combustível: " + this.combustivel + " litros");
		}
		else{
			System.out.println("Tanque Abastecido! Valor de Combustível: " + this.combustivel + " litros");
		}
	}
		
	// Exibe os atributos de Carros 

	void status(){
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Portas: " + this.portas);
		System.out.println("Aro: " + this.aro);
		System.out.println("Bicombustível ? " + this.flex);
		System.out.println("Status Combustível: " + this.combustivel);
		//System.out.println("");
	}
}
