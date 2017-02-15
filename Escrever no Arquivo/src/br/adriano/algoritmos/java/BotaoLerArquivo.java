package br.adriano.algoritmos.java;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class BotaoLerArquivo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				BotaoLerArquivo frame = new BotaoLerArquivo();
				frame.setVisible(true);
			}
		});
	}

	public BotaoLerArquivo() {
		setTitle("Ler Arquivo");
		setResizable(false);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception erro) {
			erro.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 292, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JButton btnEscreverArquivo = new JButton("Escrever no Arquivo");
		btnEscreverArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Path caminho = Paths.get("C:/Users/AndroidC22/Desktop/Teste.txt"); // Destina o caminho do arquivo a ser criado
				String texto = JOptionPane.showInputDialog(null, "Digite o texto aqui");  // Recebe o texto digitado pelo usuário
				byte[] escreverArquivo = texto.getBytes(); // Vetor que faz a leitura do bytes do arquivo
				try{
					// Esse arquivo só vai escrever se o arquivo antes já for criado
					if(Files.isExecutable(caminho)) { // Verifica se o caminho do arquivo existe
						JOptionPane.showMessageDialog(null, "Arquivo Escrito!");
						Files.write(caminho, escreverArquivo); // Escreve no arquivo destinado
						java.awt.Desktop.getDesktop().open(new File("C:/Users/AndroidC22/Desktop/Teste.txt")); // Abre o arquivo escrito
					}else {                                   
						JOptionPane.showMessageDialog(null, "Arquivo corrompido");
					}
				} catch(Exception erro){
					erro.printStackTrace();
					System.out.println("Erro ao abrir Arquivo");
					JOptionPane.showMessageDialog(null, "Erro ao abrir Arquivo");
				}				
			}
		});
		btnEscreverArquivo.setBounds(52, 52, 181, 30);
		contentPane.add(btnEscreverArquivo);		
	}
}
