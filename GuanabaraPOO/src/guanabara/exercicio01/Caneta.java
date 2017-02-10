package guanabara.exercicio01;

public class Caneta {
	
	String modelo;
	String cor;
	Float ponta;
	Boolean tampada;
	
	void status(){
		System.out.println("Modelo é " + this.modelo);
		System.out.println("Cor " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Está tampada? " + this.tampada);
	}	
	
	void rabiscar(){
		if(this.tampada == true){
			System.out.println("ERRO! não pode rabiscar");
		}
		else{
			System.out.println("OK pode rabiscar");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setModelo(String m){
		this.modelo = m;
	}
	
	public String getCor(){
		return cor;
	}
	
	public void setCor(String c){
		this.cor = c;
	}

	public Float getPonta() {
		return ponta;
	}

	public void setPonta(Float p) {
		this.ponta = p;
	}
		
}
