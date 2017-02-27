package minha.thread;

public class MinhaThread implements Runnable {

	private String nomeThread;
	private int tempo;
	private boolean estaSuspensa;
	private boolean estaTerminada;

	public MinhaThread(String nome, int tempo){
		this.nomeThread = nome;
		this.tempo = tempo;
		this.estaSuspensa = false;
	}

	@Override
	public void run(){

		System.out.println("Executando " + this.nomeThread);

		try {
			for(int i=0; i<100; i++){
				System.out.println(this.nomeThread + " , " + i);
				Thread.sleep(tempo);
				synchronized (this) {
					while(this.estaSuspensa){
						wait();
					}
					if(this.estaTerminada){
						break;
					}
				}
			}
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Terminada " + this.nomeThread);
	}
	
	synchronized void comecar(){
		this.estaSuspensa = false;
		new Thread(this, nomeThread).start();
	}

	void suspend() {
		this.estaSuspensa = true;
	}

	synchronized void resume(){
		this.estaSuspensa = false;
		notify();
	}

	synchronized void stop(){
		this.estaTerminada = true;
		notify();
	}
}
