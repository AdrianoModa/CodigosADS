
public class TestFabricaDeCarros {
	public static void main(String[] args) {

		FabricaDeCarro fabrica1 = FabricaDeCarro.getInstancia();
		System.out.println(fabrica1.criarCarroFiat());
		System.out.println(fabrica1.criarCarroFord());
		System.out.println(fabrica1.criarCarroVolks());
		
		FabricaDeCarro fabrica2 = FabricaDeCarro.getInstancia();
		System.out.println(fabrica2.criarCarroFiat());
		System.out.println(fabrica2.criarCarroFord());
		System.out.println(fabrica2.criarCarroVolks());		
		
		// Gerando Relatórios de Vendas de Carros fabricados
		
		System.out.println("<<< Relatório >>>\n" + fabrica1.gerarRelatorio() + "\n");
		
		// Outros modo de Exibir os Relatórios
		/*fabrica1 = FabricaDeCarro.getInstancia();
		System.out.println("Exibir 2:\n" + fabrica1.gerarRelatorio());		
		System.out.println("Exibir 3:\n" + FabricaDeCarro.getInstancia().gerarRelatorio());*/
	}
}
