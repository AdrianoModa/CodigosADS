package guanabara.exercicio01;

public class ExerciciosPoo {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Vermelha";
		c1.modelo = "BIC fina";
		c1.ponta = 1.33f;
		c1.tampar();			
		c1.status();
		c1.rabiscar();		
		
		// Segunda caneta
		
		Caneta c2 = new Caneta();
		
		c2.cor = "Azul";
		c2.modelo = "BIC Grossa";
		c2.ponta = 0.5f;
		c2.destampar();			
		c2.status();
		c2.rabiscar();
	}

}
