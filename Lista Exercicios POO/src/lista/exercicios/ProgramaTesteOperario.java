package lista.exercicios;

public class ProgramaTesteOperario {

	public static void main(String[] args) {
		
		Operario operario = new Operario();
		operario.setNome("Fabio Santos");
		operario.setEndereco("Av. B - C");
		operario.setTelefone("989984110");
		
		operario.setCodigoSetor(144141);
		operario.setSalarioBase(1200);
		operario.setValorProducao(150);
		
		System.out.println("Nome: " + operario.getNome());
		System.out.println("Endereço: " + operario.getEndereco());
		System.out.println("Telefone: " + operario.getTelefone());
		
		System.out.println("Código do Setor: " + operario.getCodigoSetor());
		System.out.println("Salário Base: " + operario.getSalarioBase());
		System.out.println("Valor Produção: " + operario.getValorProducao());
		System.out.println("Comissão: R$ " + operario.getComissao());
		System.out.println("Salário Líquido: R$ " + operario.calculaSalario());
	}

}
