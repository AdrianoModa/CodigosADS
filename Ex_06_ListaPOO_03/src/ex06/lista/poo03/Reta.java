package ex06.lista.poo03;

public class Reta {
	Ponto pontoInicial;
	Ponto pontoFinal;

	Reta(int x1, int y1, int x2, int y2){
		pontoInicial = new Ponto(x1,y1);
		pontoFinal =  new Ponto(x2,y2);
	}
	public void exibe(){
		pontoInicial.exibe();
		pontoFinal.exibe();
	}
}