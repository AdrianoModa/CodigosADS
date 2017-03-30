package br.unifor.arq.builder;

public class Main {

	public static void main(String[] args) {
		
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(
				new FiatBuilder());

		concessionaria.construirCarro();
		CarroProduct carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
				+ "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
				+ carro.dscMotor + "\nValor: " + carro.preco);

		System.out.println();

		concessionaria = new ConcessionariaDirector(new VolksWagenBuilder());
		concessionaria.construirCarro();
		carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
				+ "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
				+ carro.dscMotor + "\nValor: " + carro.preco);
		
		System.out.println();
		
		concessionaria = new ConcessionariaDirector(new FordBuilder());
		concessionaria.construirCarro();
		carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
				+ "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
				+ carro.dscMotor + "\nValor: " + carro.preco);
		
		System.out.println();
		
		concessionaria = new ConcessionariaDirector(new ChevroletBuilder());
		concessionaria.construirCarro();
		carro = concessionaria.getCarro();
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
				+ "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
				+ carro.dscMotor + "\nValor: " + carro.preco);
		
		System.out.println();
	}
}
