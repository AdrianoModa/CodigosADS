package br.com.adriano;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAbrirArquivo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAbrirArquivo frame = new ViewAbrirArquivo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewAbrirArquivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEscreverNoArquivo = new JButton("Escrever no Arquivo");
		btnEscreverNoArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarLerNoArquivo cla = new CriarLerNoArquivo();
				cla.abrirArquivoNotepad();
			}
		});
		btnEscreverNoArquivo.setBounds(126, 103, 182, 56);
		contentPane.add(btnEscreverNoArquivo);
	}
}
