package lista.exercicios;

public class ProgramaTesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor(1500f, 500f);
		fornecedor.setNome("Adriano Moda");
		fornecedor.setEndereco("Rua 14 - Barroso");
		fornecedor.setTelefone("3223656");
		
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("Endereco: " + fornecedor.getEndereco());
		System.out.println("Telefone " + fornecedor.getTelefone());
		System.out.println("Valor Credito " + fornecedor.getValorCredito());		
		System.out.println("Divida: R$ " + fornecedor.getValorDivida() + " reais");
		System.out.println("Saldo: R$ " + fornecedor.obterSaldo() + " reais");
	}

}
