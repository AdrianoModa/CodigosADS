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
		System.out.println("Endere�o: " + operario.getEndereco());
		System.out.println("Telefone: " + operario.getTelefone());
		
		System.out.println("C�digo do Setor: " + operario.getCodigoSetor());
		System.out.println("Sal�rio Base: " + operario.getSalarioBase());
		System.out.println("Valor Produ��o: " + operario.getValorProducao());
		System.out.println("Comiss�o: R$ " + operario.getComissao());
		System.out.println("Sal�rio L�quido: R$ " + operario.calculaSalario());
	}

}
