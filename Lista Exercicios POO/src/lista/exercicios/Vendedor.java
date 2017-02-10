package lista.exercicios;

public class Vendedor extends Empregado {
	private float valorVendas;
	private float comissao;
	
	public Vendedor(){		
	}
	
	public Vendedor(float valorVendas, float comissao){
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public float getValorVendas(){
		return (valorVendas/100)*12;
	}
	public void setValorVendas(float valorVendas){
		this.valorVendas = valorVendas;
	}
	public float getComissao(){
		return comissao;
	}
	public void setComissao(float comissao){
		this.comissao = comissao;
	}
	
	@Override
	public float calculaSalario(){
		return (getSalarioBase()-0.08f)+getComissao();
	}
}
