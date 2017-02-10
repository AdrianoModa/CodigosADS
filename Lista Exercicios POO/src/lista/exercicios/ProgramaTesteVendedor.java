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
		System.out.println("Endere�o: " + vendedor.getEndereco());
		System.out.println("Telefone: " + vendedor.getTelefone());

		System.out.println("C�digo do Setor: " + vendedor.getCodigoSetor());
		System.out.println("Sal�rio Base: " + vendedor.getSalarioBase());
		System.out.println("Valor Produ��o: " + vendedor.getValorVendas());
		System.out.println("Comiss�o: R$ " + vendedor.getComissao());
		System.out.println("Sal�rio L�quido: R$ " + vendedor.calculaSalario());
	}
}
