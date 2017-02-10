package lista.exercicios;

public class Operario extends Empregado{
	
	private float valorProducao;
	private float comissao;
	
	public Operario(){	
		super();
	}
	
	public Operario(float valorProducao, float comissao){
		super(2552,1250);
		this.valorProducao = valorProducao;
		this.comissao = comissao;		
	}
	
	public float getValorProducao(){
		return (valorProducao/100)*10;
	}
	public void setValorProducao(float valorProducao){
		this.valorProducao = valorProducao;
	}
	public float getComissao(){
		return comissao+valorProducao;
	}
	public void setComissao(float comissao){
		this.comissao = comissao;
	}
	
	@Override
	public float calculaSalario(){
		return (getSalarioBase()-0.08f)+getComissao();
	}
}
