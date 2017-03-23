package br.unifor.arq.facade;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFacade {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("##### Configurando subsistemas #####");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");	
		
		// UIManager setando Visual do Windows padr�o da m�quina
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");		
		} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}	
		
		// Criar o objeto para Escolher arquivos
		JFileChooser escolhaArquivo = new JFileChooser(); 
		
		// Extens�o permitidas por filtro para escolher arquivo de imagem
		escolhaArquivo.setFileFilter(new FileNameExtensionFilter("Arquivo de Imagem", "jpg","png","gif"));	
		// O objeto exibe os arquivos para escolher
		escolhaArquivo.showOpenDialog(escolhaArquivo);
		// Recebe o nome do arquivo que � um Object, ent�o converte-se para String para ser repassada no m�todo referente
		String arquivoImagem = String.valueOf(escolhaArquivo.getSelectedFile());
		// Chama o metodo recebendo o nome do arquivo agora convertido em String 
		fachada.renderizarImagem(arquivoImagem);
		
		// Verifica se o Arquivo foi escolhido e retorna um feedback
		if(escolhaArquivo.isFileSelectionEnabled() == true){
			System.out.println("A imagem est� na Tela agora!");
		}else{
			System.out.println("Ops Algo deu errado!"); // Exibe mensagem feedback
		}		
		
		Thread.sleep(3000); // Espera 3 segundos para o pr�ximo comando
		
		// Segue o mesmo efeito do JFileChooser para arquivo de �udio
		escolhaArquivo.setFileFilter(new FileNameExtensionFilter("Arquivo de Audio", "mp3"));
		escolhaArquivo.showOpenDialog(escolhaArquivo);
		String arquivoAudio = String.valueOf(escolhaArquivo.getSelectedFile());
		fachada.reproduzirAudio(arquivoAudio);
		fachada.lerInput();
		
		if(escolhaArquivo.isFileSelectionEnabled() == true){
			System.out.println("O �udio est� na Tocando agora!");
		}else{
			System.out.println("Ops Algo deu errado!"); // Exibe mensagem feedback
		}
	}
}
