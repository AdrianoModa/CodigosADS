package aula06;

public class Aula06 {

	public static void main(String[] args) {
		
		// Objeto criado
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.play();
		c.pause();
		c.maisVolume();
		c.abrirMenu();
		c.fecharMenu();
	}
}