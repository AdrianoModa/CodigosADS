package aula06;

public class Aula06 {

	public static void main(String[] args) {
		
		// Objeto criado
		ControleRemoto c1 = new ControleRemoto();
		ControleRemoto c2 = new ControleRemoto();
		
		c1.ligar();
		c1.maisVolume();
		c1.play();
		c1.pause();
		c1.maisVolume();
		c1.abrirMenu();
		c1.fecharMenu();
		
		c2.ligar();
	}
}