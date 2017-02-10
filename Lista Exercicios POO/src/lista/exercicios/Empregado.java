package lista.exercicios;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private float salarioBase;
	
	public Empregado(){		
	}
	
	public Empregado(int codigoSetor, float salarioBase){
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}
	
	public int getCodigoSetor(){
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor){
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase(){
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase){
		this.salarioBase = salarioBase;
	}
	
	protected float calculaSalario(){
		return getSalarioBase()-0.08f;
	}
	
}
