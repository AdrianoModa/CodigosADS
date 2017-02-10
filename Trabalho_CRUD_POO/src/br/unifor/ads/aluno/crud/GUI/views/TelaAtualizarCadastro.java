package br.unifor.ads.aluno.crud.GUI.views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.unifor.ads.aluno.crud.DAO.UsuarioDAO;
import br.unifor.ads.aluno.crud.modelo.Usuario;
import br.unifor.ads.aluno.crud.regradenegocio.CalculaTempoEstacionamento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.SystemColor;

/**
 * @author Adriano Moda Feitosa
 * @since 25/11/2016
 * @version
 */

public class TelaAtualizarCadastro extends JFrame {

	private static final long serialVersionUID = 8573641432072184278L;
	private JPanel TelaAtualizaCadastroDialog;
	private JTextField textFieldAtualizaNome;
	private JTextField textFieldAtualizaCPF;
	private JTextField textFieldAtualizaEmail;
	private JTextField textFieldAtualizaTelefone;
	private JTextField textFieldIdUsuario;
	private JTextField textFieldAtualizaVeiculo;
	private JTextField textFieldAtualizaPlaca;
	private JTextField atualizaCampoTempoEstimado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtualizarCadastro frame = new TelaAtualizarCadastro();
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
	public TelaAtualizarCadastro() {
		setTitle("Atualizar Cadastro - CarStop Serviços");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 375);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Tema do Windows
		} catch (Exception e) {
			e.printStackTrace();
		} 
		TelaAtualizaCadastroDialog = new JPanel();
		TelaAtualizaCadastroDialog.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TelaAtualizaCadastroDialog);
		TelaAtualizaCadastroDialog.setLayout(null);

		JLabel lblAtualizarCadastro = new JLabel("Atualizar Cadastro");
		lblAtualizarCadastro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAtualizarCadastro.setBounds(10, 11, 248, 36);
		TelaAtualizaCadastroDialog.add(lblAtualizarCadastro);

		JLabel lblNovosDadosDo = new JLabel("Novos Dados do Usu\u00E1rio");
		lblNovosDadosDo.setBounds(10, 46, 166, 14);
		TelaAtualizaCadastroDialog.add(lblNovosDadosDo);

		JLabel label_2 = new JLabel("Nome");
		label_2.setBounds(10, 96, 46, 14);
		TelaAtualizaCadastroDialog.add(label_2);

		JLabel label_3 = new JLabel("CPF");
		label_3.setBounds(10, 121, 46, 14);
		TelaAtualizaCadastroDialog.add(label_3);

		JLabel label_4 = new JLabel("E-mail");
		label_4.setBounds(10, 146, 46, 14);
		TelaAtualizaCadastroDialog.add(label_4);

		JLabel label_5 = new JLabel("Telefone");
		label_5.setBounds(10, 171, 75, 14);
		TelaAtualizaCadastroDialog.add(label_5);

		textFieldAtualizaNome = new JTextField();
		textFieldAtualizaNome.setColumns(10);
		textFieldAtualizaNome.setBounds(97, 96, 192, 20);
		TelaAtualizaCadastroDialog.add(textFieldAtualizaNome);

		textFieldAtualizaCPF = new JTextField();
		textFieldAtualizaCPF.setColumns(10);
		textFieldAtualizaCPF.setBounds(97, 118, 192, 20);
		TelaAtualizaCadastroDialog.add(textFieldAtualizaCPF);

		textFieldAtualizaEmail = new JTextField();
		textFieldAtualizaEmail.setColumns(10);
		textFieldAtualizaEmail.setBounds(97, 143, 192, 20);
		TelaAtualizaCadastroDialog.add(textFieldAtualizaEmail);

		textFieldAtualizaTelefone = new JTextField();
		textFieldAtualizaTelefone.setColumns(10);
		textFieldAtualizaTelefone.setBounds(97, 168, 134, 20);
		TelaAtualizaCadastroDialog.add(textFieldAtualizaTelefone);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario atualizaUsuario = new Usuario();
				CalculaTempoEstacionamento calctemp = new CalculaTempoEstacionamento();
				atualizaUsuario.setId(Long.parseLong(textFieldIdUsuario.getText()));
				atualizaUsuario.setNome(textFieldAtualizaNome.getText());
				atualizaUsuario.setCpf(textFieldAtualizaCPF.getText());
				atualizaUsuario.setEmail(textFieldAtualizaEmail.getText());
				atualizaUsuario.setTelefone(textFieldAtualizaTelefone.getText());
				atualizaUsuario.setNome_veiculo(textFieldAtualizaVeiculo.getText());
				atualizaUsuario.setPlaca(textFieldAtualizaPlaca.getText());
				int campotempo = Integer.parseInt(atualizaCampoTempoEstimado.getText());				
				calctemp.calculaPreco(campotempo);				

				if(textFieldAtualizaNome.getText().isEmpty() || (textFieldAtualizaCPF.getText().isEmpty() || (textFieldAtualizaEmail.getText().isEmpty()
						|| textFieldAtualizaTelefone.getText().isEmpty() || (textFieldIdUsuario.getText().isEmpty()
								|| textFieldAtualizaVeiculo.getText().isEmpty() || textFieldAtualizaPlaca.getText().isEmpty())))){
					JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios","Cadastrar Leitor",JOptionPane.WARNING_MESSAGE);				
				} else {
					UsuarioDAO usuarioAtualizado = new UsuarioDAO();
					usuarioAtualizado.atualiza(atualizaUsuario);
					JOptionPane.showMessageDialog(null, "O cadastro foi Atualizado com Sucesso!","Lista de Cadastrados",JOptionPane.WARNING_MESSAGE);
				}
				// Limpa os campos
				textFieldAtualizaNome.setText("");
				textFieldAtualizaCPF.setText("");
				textFieldAtualizaEmail.setText("");
				textFieldAtualizaTelefone.setText("");
				textFieldIdUsuario.setText("");
				textFieldAtualizaVeiculo.setText("");
				textFieldAtualizaPlaca.setText("");
			}
		});
		btnAtualizar.setBounds(97, 282, 113, 23);
		TelaAtualizaCadastroDialog.add(btnAtualizar);

		JButton LimparDados = new JButton("Limpar");
		LimparDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAtualizaNome.setText("");
				textFieldAtualizaCPF.setText("");
				textFieldAtualizaEmail.setText("");
				textFieldAtualizaTelefone.setText("");
				textFieldIdUsuario.setText("");
				textFieldAtualizaVeiculo.setText("");
				textFieldAtualizaPlaca.setText("");
			}
		});
		LimparDados.setBounds(220, 282, 69, 23);
		TelaAtualizaCadastroDialog.add(LimparDados);

		JEditorPane dtrpnOSistemaAtulizar = new JEditorPane();
		dtrpnOSistemaAtulizar.setBackground(SystemColor.control);
		dtrpnOSistemaAtulizar.setText("O sistema Atualizar\u00E1 os dados seguintes \r\natrav\u00E9s do Id do Usu\u00E1ro.");
		dtrpnOSistemaAtulizar.setBounds(299, 28, 248, 51);
		TelaAtualizaCadastroDialog.add(dtrpnOSistemaAtulizar);

		JButton btnNewButton = new JButton("Consultar ID Usu\u00E1rio(s)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioDAO usuarioCadastrado = new UsuarioDAO();
				usuarioCadastrado.exibeCadastrados();
			}
		});
		btnNewButton.setBounds(309, 92, 186, 23);
		TelaAtualizaCadastroDialog.add(btnNewButton);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 71, 46, 14);
		TelaAtualizaCadastroDialog.add(lblId);

		textFieldIdUsuario = new JTextField();
		textFieldIdUsuario.setColumns(10);
		textFieldIdUsuario.setBounds(97, 71, 74, 20);
		TelaAtualizaCadastroDialog.add(textFieldIdUsuario);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(408, 282, 89, 23);
		TelaAtualizaCadastroDialog.add(btnSair);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(309, 282, 89, 23);
		TelaAtualizaCadastroDialog.add(btnVoltar);
		
		JLabel lblVeiculo = new JLabel("Veiculo");
		lblVeiculo.setBounds(10, 196, 46, 14);
		TelaAtualizaCadastroDialog.add(lblVeiculo);
		
		textFieldAtualizaVeiculo = new JTextField();
		textFieldAtualizaVeiculo.setColumns(10);
		textFieldAtualizaVeiculo.setBounds(97, 193, 134, 20);
		TelaAtualizaCadastroDialog.add(textFieldAtualizaVeiculo);
		
		textFieldAtualizaPlaca = new JTextField();
		textFieldAtualizaPlaca.setColumns(10);
		textFieldAtualizaPlaca.setBounds(97, 219, 134, 20);
		TelaAtualizaCadastroDialog.add(textFieldAtualizaPlaca);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(10, 222, 46, 14);
		TelaAtualizaCadastroDialog.add(lblPlaca);
		
		JLabel lblTempoEstimado = new JLabel("Tempo estimado");
		lblTempoEstimado.setBounds(10, 254, 89, 14);
		TelaAtualizaCadastroDialog.add(lblTempoEstimado);
		
		atualizaCampoTempoEstimado = new JTextField();
		atualizaCampoTempoEstimado.setColumns(10);
		atualizaCampoTempoEstimado.setBounds(97, 251, 74, 20);
		TelaAtualizaCadastroDialog.add(atualizaCampoTempoEstimado);
		
		JLabel lblEmHoras = new JLabel("hora(s)");
		lblEmHoras.setBounds(181, 254, 89, 14);
		TelaAtualizaCadastroDialog.add(lblEmHoras);
	}
}
