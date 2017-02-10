package lista.exercicios;

public class ProgramaTesteVendedor {

	public static void main(String[] args) {

		Vendedor vendedor = new Vendedor();

		vendedor.setNome("Edilson da Silva");
		vendedor.setEndereco("Rua 16 - Lagoa");
		vendedor.setTelefone("98465400");

		vendedor.setCodigoSetor(1541);
		vendedor.setSalarioBase(2300);
		vendedor.setValorVendas(850);

		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("Endereço: " + vendedor.getEndereco());
		System.out.println("Telefone: " + vendedor.getTelefone());

		System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
		System.out.println("Salário Base: " + vendedor.getSalarioBase());
		System.out.println("Valor Produção: " + vendedor.getValorVendas());
		System.out.println("Comissão: R$ " + vendedor.getComissao());
		System.out.println("Salário Líquido: R$ " + vendedor.calculaSalario());
	}
}
