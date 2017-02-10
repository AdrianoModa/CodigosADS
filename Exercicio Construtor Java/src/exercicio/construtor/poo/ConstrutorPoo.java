package exercicio.construtor.poo;

public class ConstrutorPoo {

	public static void main(String[] args) {
		//Nome, modelo, cor, portas, aro, flex e combustível
		
		Carros car1 = new Carros("Ferrari","F-15","Vermelha",4,18,true, 30);
		Carros car2 = new Carros("Lamborghini","F-20", "Amarelo",2,16,true, 8);
		Carros car3 = new Carros("BMW","Z40","Branco",2,18.6,true, 6);
		Carros car4 = new Carros("Chevette","SL","Azul",4,20,false, 15);
		
		// Exibir Carros
		car1.status();	
		car1.Abastecer();
		System.out.println("");
		car2.status();
		car2.Abastecer();
		System.out.println("");
		car3.status();
		car3.Abastecer();
		System.out.println("");
		car4.status();
		car4.Abastecer();
	}
}
