package br.unifor.ads.aluno.crud.GUI.views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.unifor.ads.aluno.crud.DAO.UsuarioLoginDAO;
import br.unifor.ads.aluno.crud.modelo.UsuarioLogin;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2321337152462845272L;
	private JPanel telaCadastro;
	private JTextField textFieldNomeLogin;
	private JTextField textFieldCadLogin;
	private JPasswordField passwordFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarLogin frame = new TelaCadastrarLogin();
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
	public TelaCadastrarLogin() {
		setTitle("Tela de Cadastro de Login - CarStop Serviços");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Tema do Windows
		} catch (Exception e) {
			e.printStackTrace();
		}
		telaCadastro = new JPanel();
		telaCadastro.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(telaCadastro);
		telaCadastro.setLayout(null);

		JLabel lblCadastrarNovoUsuario = new JLabel("Cadastrar Novo Usu\u00E1rio - CarStop Servi\u00E7os");
		lblCadastrarNovoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastrarNovoUsuario.setBounds(10, 38, 348, 29);
		telaCadastro.add(lblCadastrarNovoUsuario);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 78, 56, 29);
		telaCadastro.add(lblNome);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(10, 118, 56, 29);
		telaCadastro.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(10, 158, 56, 29);
		telaCadastro.add(lblSenha);

		textFieldNomeLogin = new JTextField();
		textFieldNomeLogin.setBounds(66, 84, 213, 20);
		telaCadastro.add(textFieldNomeLogin);
		textFieldNomeLogin.setColumns(10);

		textFieldCadLogin = new JTextField();
		textFieldCadLogin.setBounds(66, 124, 213, 20);
		telaCadastro.add(textFieldCadLogin);
		textFieldCadLogin.setColumns(10);

		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(66, 164, 103, 20);
		telaCadastro.add(passwordFieldSenha);

		JButton btnCadastrarUsuario = new JButton("Cadastrar Usu\u00E1rio");
		btnCadastrarUsuario.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {	
				UsuarioLogin usuarioLogin = new UsuarioLogin();
				usuarioLogin.setNome(textFieldNomeLogin.getText());
				usuarioLogin.setLogin(textFieldCadLogin.getText());
				usuarioLogin.setSenha(passwordFieldSenha.getText());
				passwordFieldSenha.toString();
				if(textFieldNomeLogin.getText().isEmpty() || textFieldCadLogin.getText().isEmpty() || passwordFieldSenha.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Algum campo não foi Informado", "Cadastra Usuáro", JOptionPane.WARNING_MESSAGE);
				}else{
					UsuarioLoginDAO usuarioCadastra = new UsuarioLoginDAO();
					usuarioCadastra.cadastraLogin(usuarioLogin);
					JOptionPane.showMessageDialog(null, "Login Cadastrado com Sucesso!", "Cadastrar Login", JOptionPane.INFORMATION_MESSAGE);
				}
				
				// Limpa os campos
				textFieldNomeLogin.setText("");
				textFieldCadLogin.setText("");
				passwordFieldSenha.setText("");
			}			
		});
		btnCadastrarUsuario.setBounds(66, 198, 119, 23);
		telaCadastro.add(btnCadastrarUsuario);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(195, 198, 89, 23);
		telaCadastro.add(btnSair);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(313, 198, 89, 23);
		telaCadastro.add(btnVoltar);
	}
}
