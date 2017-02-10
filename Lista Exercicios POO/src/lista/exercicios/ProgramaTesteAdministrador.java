package lista.exercicios;

public class ProgramaTesteAdministrador {

	public static void main(String[] args) {

		Administrador administrador = new Administrador(350f);
		Empregado empregado = new Empregado();
		empregado.setNome("Ariane Moda Feitosa");
		empregado.setEndereco("Av. B. Hill - California");
		empregado.setTelefone("84546669");

		System.out.println("Administrador(a): " + empregado.getNome());
		System.out.println("Endereco: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.println("Ajuda de Custo: R$" + administrador.getAjudaDeCusto());
		System.out.println("Código do Setor: " + administrador.getCodigoSetor());
		System.out.println("Salário Base: R$" + administrador.getSalarioBase());
		System.out.println("Salario líquido Administrador: R$" 
				+ administrador.calculaSalario());
	}
}
