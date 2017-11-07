package br.com.adriano;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class CriarLerNoArquivo {

	public void abrirArquivoNotepad(){
		Path caminho = Paths.get(System.getProperty("user.home") + "/Teste.txt"); 
		String texto = "TesteTesteTesteTesteTesteTeste"; //JOptionPane.showInputDialog(null, "Digite o texto aqui");  
		byte[] escreverArquivo = texto.getBytes();
		{ 
			try{

				if(Files.isExecutable(caminho)) { 
					JOptionPane.showMessageDialog(null, "Arquivo Escrito!");
					Files.write(caminho, escreverArquivo); 
					java.awt.Desktop.getDesktop().open(new File(System.getProperty("user.home") + "/Teste.txt")); // Abre o arquivo escrito
				}else {                                   
					JOptionPane.showMessageDialog(null, "Arquivo corrompido");
				}
			} catch(Exception erro){
				erro.printStackTrace();
				System.out.println("Erro ao abrir Arquivo");
				JOptionPane.showMessageDialog(null, "Erro ao abrir Arquivo");
			}	
		}
	}
}