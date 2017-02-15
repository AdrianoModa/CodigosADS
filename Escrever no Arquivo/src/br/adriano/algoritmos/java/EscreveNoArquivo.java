package br.adriano.algoritmos.java;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class EscreveNoArquivo {

	public static void main(String[] args) {

		// Destino um caminho para o arquivo
		Path caminho = Paths.get("C:/Users/AndroidC22/Desktop/Teste.txt");
		// Recebe a entrada do texto digitado
		String texto = JOptionPane.showInputDialog(null, "Digite uma Mensagem");
		// Faz a leitura dos bytes do arquivo
		byte[] escrevearquivo = texto.getBytes();
		try{
			System.out.println("Criado Arquivo!");
			JOptionPane.showMessageDialog(null, "Arquivo Criado!");
			// Escreve o texto digitado no arquivo destinado
			Files.write(caminho, escrevearquivo);
			// Por fim, abre esse arquivo para o usuário
			java.awt.Desktop.getDesktop().open(new File("C:/Users/AndroidC22/Desktop/Teste.txt"));
		}catch(Exception erro){
			erro.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro no Arquivo!");
		}
	}
}