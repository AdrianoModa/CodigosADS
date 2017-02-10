package lista.exercicios;

public class Administrador extends Empregado {
	float ajudaDeCusto;
	
	public Administrador(){
	}
	
	public Administrador(float ajudaDeCusto){
		super(25, 350f);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public float getAjudaDeCusto(){
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(float ajudaDeCusto){
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public float calculaSalario(){
		return (getSalarioBase()-0.08f)+ajudaDeCusto;
	}
}
