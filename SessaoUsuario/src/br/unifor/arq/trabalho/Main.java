package br.unifor.arq.trabalho;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hacker acessando");
		SessaoUsuarios banco = new SessaoProxy("Hacker", "1234");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

		System.out.println("\nAdministrador acessando");
		banco = new SessaoProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

	}

}
