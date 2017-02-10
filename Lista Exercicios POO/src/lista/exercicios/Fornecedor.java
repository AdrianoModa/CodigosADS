package lista.exercicios;

public class Fornecedor extends Pessoa {
	private float valorCredito;
	private float valorDivida;
	
	public Fornecedor(){
	}
	
	public Fornecedor(float valorCredito, float valorDivida){
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
		
	public float getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	float obterSaldo(){
		return this.valorCredito-this.valorDivida;
	}

}
