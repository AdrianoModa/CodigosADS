package br.unifor.ads.aluno.crud.GUI.views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.unifor.ads.aluno.crud.DAO.UsuarioLoginDAO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InterfaceTelaLogin extends JFrame {

	/**
	 * @author Adriano Moda Feitosa
	 * @since 25/11/2016
	 */
	private static final long serialVersionUID = 816337398659986123L;
	private JPanel telaLogin;
	private JTextField textFieldlTelaLogin;
	private JPasswordField passwordFieldTelaSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceTelaLogin frame = new InterfaceTelaLogin();
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
	public InterfaceTelaLogin() {
		setTitle("Tela de Login - CarStop Serviços");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Tema do Windows
		} catch (Exception e) {
			e.printStackTrace();
		}
		telaLogin = new JPanel();
		telaLogin.setBackground(Color.WHITE);
		telaLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(telaLogin);
		telaLogin.setLayout(null);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setBounds(121, 89, 78, 27);
		telaLogin.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(121, 127, 78, 27);
		telaLogin.add(lblSenha);

		textFieldlTelaLogin = new JTextField();
		textFieldlTelaLogin.setBounds(175, 94, 189, 20);
		telaLogin.add(textFieldlTelaLogin);

		passwordFieldTelaSenha = new JPasswordField();
		passwordFieldTelaSenha.setBounds(175, 132, 124, 20);
		telaLogin.add(passwordFieldTelaSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String tlogin = textFieldlTelaLogin.getText();
				String tsenha = (passwordFieldTelaSenha.getText());
				if(textFieldlTelaLogin.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"Usuário não Informado", "Remover Usuário",JOptionPane.WARNING_MESSAGE);
				}else{
					UsuarioLoginDAO usuariologado = new UsuarioLoginDAO();					
					usuariologado.validarLogin(tlogin,tsenha);
				}
			}
		});
		btnEntrar.setBounds(175, 165, 89, 23);
		telaLogin.add(btnEntrar);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(274, 165, 89, 23);
		telaLogin.add(btnSair);

		JButton btnCadastrarSenha = new JButton("Cadastrar Senha");
		btnCadastrarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrarLogin tclogin = new TelaCadastrarLogin();
				tclogin.setVisible(true);
			}
		});
		btnCadastrarSenha.setBounds(175, 199, 189, 23);
		telaLogin.add(btnCadastrarSenha);

		JLabel lblTelaDeLogin = new JLabel("Tela de Login - CarStop Servi\u00E7os");
		lblTelaDeLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelaDeLogin.setBounds(121, 47, 243, 31);
		telaLogin.add(lblTelaDeLogin);
		
		JLabel lblNoPossuiCadastro = new JLabel("N\u00E3o possui cadastro? ");
		lblNoPossuiCadastro.setBounds(48, 203, 117, 14);
		telaLogin.add(lblNoPossuiCadastro);
	}
}
