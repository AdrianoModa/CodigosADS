package lista.exercicios;

public class ProgramaTesteEmpregado {

	public static void main(String[] args) {

		Empregado empregado = new Empregado(1212,8500f);
		empregado.setNome("Frodo Bolseiro");
		empregado.setEndereco("Rua Jardim - Condado");
		empregado.setTelefone("3257414");

		System.out.println("Nome:" + empregado.getNome());
		System.out.println("Endereco: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.println("Codigo Setor: " + empregado.getCodigoSetor());
		System.out.println("Salario Base: R$ " + empregado.getSalarioBase());
		System.out.println("Salário Líquido R$ " + empregado.calculaSalario());
	}
}