public class FabricaDeCarro {

	protected FabricaDeCarro() { // Proteger o construtor
	}

	public static FabricaDeCarro getInstancia() { // Método que verifica refere pra Fábrica
		if (instancia == null)
			instancia = new FabricaDeCarro();
		return instancia;
	}

	public static void main(String[] args) {

		FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
		System.out.println(fabrica.criarCarroFiat());
		System.out.println(fabrica.criarCarroFord());
		System.out.println(fabrica.criarCarroVolks());
		System.out.println("Exibir 1:\n" + fabrica.gerarRelatorio());

		fabrica = FabricaDeCarro.getInstancia();
		System.out.println("Exibir 2:\n" + fabrica.gerarRelatorio());		
		System.out.println("Exibir 3:\n" + FabricaDeCarro.getInstancia().gerarRelatorio());
	}

	protected int totalCarrosFiat;
	protected int totalCarrosFord;
	protected int totalCarrosVolks;
	public static FabricaDeCarro instancia;

	public String criarCarroVolks() {
		return new String("Carro Volks #" + totalCarrosVolks++ + " criado.");
	}

	public String criarCarroFord() {
		return new String("Carro Ford #" + totalCarrosFord++ + " criado.");
	}

	public String criarCarroFiat() {
		return new String("Carro Fiat #" + totalCarrosFiat++ + " criado.");
	}

	public String gerarRelatorio() {
		return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
				+ "\nTotal de carros Ford vendidos: " + totalCarrosFord
				+ "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
	}
}