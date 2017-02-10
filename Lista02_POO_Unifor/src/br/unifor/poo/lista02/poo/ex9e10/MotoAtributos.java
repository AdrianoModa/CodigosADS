package br.unifor.poo.lista02.poo.ex9e10;

public class MotoAtributos {

	public static void main(String[] args) {

		MotoConstrutor moto1 = new MotoConstrutor("Yamaha","Fazer","Branca", 2);
		MotoConstrutor moto2 = new MotoConstrutor("Honda", "Twister", "Vermelha", 3);
		MotoConstrutor moto3 = new MotoConstrutor("Harley Davidson", "Low Rider", "Preta", 5);
		MotoConstrutor moto4 = new MotoConstrutor("Suzuki", "B-King", "Branca", 4);
		MotoConstrutor moto5 = new MotoConstrutor("Ducati ", "996", "Preta", 1);
		MotoConstrutor moto6 = new MotoConstrutor("Batpod ", "Wayne Ind.", "Preta", 4);
		
		Moto cambiomoto1 = new Moto();
		
		moto1.imprimir();
		cambiomoto1.imprimir(moto1.cambio);
		System.out.println("");
		moto2.imprimir();
		cambiomoto1.imprimir(moto2.cambio);
		System.out.println("");
		moto3.imprimir();
		cambiomoto1.imprimir(moto3.cambio);
		System.out.println("");
		moto4.imprimir();
		cambiomoto1.imprimir(moto4.cambio);
		System.out.println("");
		moto5.imprimir();
		cambiomoto1.imprimir(moto5.cambio);
		System.out.println("");		
		moto6.imprimir();
		cambiomoto1.imprimir(moto6.cambio);
		System.out.println("");
	}
}