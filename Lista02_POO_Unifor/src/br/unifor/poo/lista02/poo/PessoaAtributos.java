package br.unifor.poo.lista02.poo;

public class PessoaAtributos {

	public static void main(String[] args) {
		
		// Nome, Endereço e Telefone
		
		PessoaConstrutor pessoa1 = new PessoaConstrutor("Adriano", "Rua Manuel Figueiredo n.410 – Barroso", "(85)98845-2525");
		PessoaConstrutor pessoa2 = new PessoaConstrutor("Ariane", "Rua B. Studart n.80 – Aldeota", "(85)98457-4822");
		PessoaConstrutor pessoa3 = new PessoaConstrutor("Thiago", "Rua Inaja n.41 – Cidade Nova", "(85)98154-7415");
		PessoaConstrutor pessoa4 = new PessoaConstrutor("Bruna", "Rua 17 n.05 – Castelo Branco", "(85)98998-5521");
		PessoaConstrutor pessoa5 = new PessoaConstrutor("T.Stark", "Rua Maverick n.171 – B. Hills", "(85)98011-0011");
		PessoaConstrutor pessoa6 = new PessoaConstrutor("Frodo", "Rua Lotr n.45 – Condado", "(85)984745569");
		
		// Exibir Atributos
		pessoa1.status();
		pessoa2.status();
		pessoa3.status();
		pessoa4.status();
		pessoa5.status();
		pessoa6.status();
	}
}