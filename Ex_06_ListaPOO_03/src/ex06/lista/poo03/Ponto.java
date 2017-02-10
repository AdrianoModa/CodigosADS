package ex06.lista.poo03;

public class Ponto {
	int x;
	int y;
	
	Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setaCoordenadas(int x, int y){		
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void exibe(){
		System.out.println("Valor de x " + x);
		System.out.println("valor de y " + y);
	}
	
}
