package minha.thread;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class ViewThread extends JFrame {

	/**
	 * @author AndroidC22
	 * @since 19/01/2017
	 */

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnIniciar;
	private JButton btnPausar;
	private JButton btnContinuar;
	private JButton btnParar;
	private JButton btnSair;
	private JTextField campoNomeThread;
	private String threadMensagem;
	private MinhaThread thread = new MinhaThread("Thread #01",1000);

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				ViewThread frame = new ViewThread();
				frame.setVisible(true);			
			}
		});
	}

	public ViewThread(){
		setTitle("Brincando com Threads");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setBounds(100, 200, 331, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				thread.comecar();
				threadMensagem = "Iniciando Thread";
				campoNomeThread.setText(threadMensagem);
			}
		});
		btnIniciar.setBounds(56, 119, 202, 30);
		contentPane.add(btnIniciar);

		btnPausar = new JButton("Pausar");
		btnPausar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				thread.suspend();
				threadMensagem = "Thread pausada!";
				campoNomeThread.setText(threadMensagem);
			}
		});
		btnPausar.setBounds(56, 164, 202, 30);
		contentPane.add(btnPausar);

		btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				thread.resume();
				threadMensagem = "Continua Thread...";
				campoNomeThread.setText(threadMensagem);
			}
		});	
		btnContinuar.setBounds(56, 209, 202, 30);
		contentPane.add(btnContinuar);

		btnParar = new JButton("Parar");
		btnParar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				thread.stop();
				threadMensagem = "Thread Parada!";
				campoNomeThread.setText(threadMensagem);
			}
		});	
		btnParar.setBounds(56, 254, 202, 30);
		contentPane.add(btnParar);

		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);
			}
		});
		btnSair.setBounds(54, 299, 204, 30);
		contentPane.add(btnSair);

		campoNomeThread = new JTextField();
		campoNomeThread.setBackground(Color.WHITE);
		campoNomeThread.setHorizontalAlignment(SwingConstants.CENTER);
		campoNomeThread.setText("Thread");
		campoNomeThread.setEditable(false);
		campoNomeThread.setFont(new Font("Tahoma", Font.PLAIN, 26));
		campoNomeThread.setBounds(10, 30, 290, 74);
		contentPane.add(campoNomeThread);
		campoNomeThread.setColumns(10);

		JLabel lblThread = new JLabel("Thread");
		lblThread.setBounds(10, 11, 46, 14);
		contentPane.add(lblThread);
	}
}