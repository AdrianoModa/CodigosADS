package br.unifor.ads.aluno.crud.GUI.views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.unifor.ads.aluno.crud.DAO.UsuarioDAO;
import br.unifor.ads.aluno.crud.modelo.Usuario;
import br.unifor.ads.aluno.crud.regradenegocio.CalculaTempoEstacionamento;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * @author Adriano Moda Feitosa
 * @since 25/11/2016
 * @version 1.0
 */

public class TelaCadastrarUsuario extends JFrame {

	private static final long serialVersionUID = 4865085531816849277L;
	private JPanel TelaPrincipal;
	private JTextField campoNome;
	private JTextField campoCPF;
	private JTextField campoEmail;
	private JTextField campoTelefone;
	private JTextField campoTempoEstimado;
	private JTextField campoVeiculo;
	private JTextField campoPlaca;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarUsuario frame = new TelaCadastrarUsuario();
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
	public TelaCadastrarUsuario() {
		setTitle("Tela Cadastrar Usuário - CarStop Serviços");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 375);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // Tema do Windows
		} catch (Exception e) {
			e.printStackTrace();
		}

		TelaPrincipal = new JPanel();
		TelaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TelaPrincipal);
		TelaPrincipal.setLayout(null);

		JLabel lblCadastroDeUsurio = new JLabel("Cadastro de Usu\u00E1rio");
		lblCadastroDeUsurio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroDeUsurio.setBounds(10, 11, 248, 36);
		TelaPrincipal.add(lblCadastroDeUsurio);

		JLabel lblCadastrarNovoUsurio = new JLabel("Cadastrar Novo Usu\u00E1rio");
		lblCadastrarNovoUsurio.setBounds(10, 46, 166, 14);
		TelaPrincipal.add(lblCadastrarNovoUsurio);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 71, 46, 14);
		TelaPrincipal.add(lblNome);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 96, 46, 14);
		TelaPrincipal.add(lblCpf);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 118, 46, 14);
		TelaPrincipal.add(lblEmail);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 146, 84, 14);
		TelaPrincipal.add(lblTelefone);

		campoNome = new JTextField();
		campoNome.setBounds(104, 71, 192, 20);
		TelaPrincipal.add(campoNome);
		campoNome.setColumns(10);

		campoCPF = new JTextField();
		campoCPF.setBounds(104, 93, 192, 20);
		TelaPrincipal.add(campoCPF);
		campoCPF.setColumns(10);

		campoEmail = new JTextField();
		campoEmail.setBounds(104, 115, 192, 20);
		TelaPrincipal.add(campoEmail);
		campoEmail.setColumns(10);

		campoTelefone = new JTextField();
		campoTelefone.setBounds(104, 140, 134, 20);
		TelaPrincipal.add(campoTelefone);
		campoTelefone.setColumns(10);

		JButton btnCadastraTelaPrincipal = new JButton("Cadastrar");
		btnCadastraTelaPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario adicionaUsuario = new Usuario();				
				adicionaUsuario.setNome(campoNome.getText());
				adicionaUsuario.setCpf(campoCPF.getText());
				adicionaUsuario.setEmail(campoEmail.getText());
				adicionaUsuario.setTelefone(campoTelefone.getText());
				adicionaUsuario.setNome_veiculo(campoVeiculo.getText());
				adicionaUsuario.setPlaca(campoPlaca.getText());
				int tempoLeitura = Integer.parseInt(campoTempoEstimado.getText());
				CalculaTempoEstacionamento tempo = new CalculaTempoEstacionamento();
				tempo.calculaPreco(tempoLeitura);

				if(campoNome.getText().isEmpty() || (campoCPF.getText().isEmpty() || (campoEmail.getText().isEmpty()
						|| campoTelefone.getText().isEmpty() || campoVeiculo.getText().isEmpty() || campoPlaca.getText().isEmpty() 
						))){
					JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios","Cadastrar Usuario",JOptionPane.WARNING_MESSAGE);				
				} else {
					UsuarioDAO usuarioDao = new UsuarioDAO();
					usuarioDao.adiciona(adicionaUsuario);
					JOptionPane.showMessageDialog(null, "Usuário " + campoNome.getText() + "\n Inserido com Sucesso!", "Cadastrar Usuario",JOptionPane.INFORMATION_MESSAGE);
				}
				// Limpa os campos
				campoNome.setText("");
				campoCPF.setText("");
				campoEmail.setText("");
				campoTelefone.setText("");
				campoTempoEstimado.setText("");
				campoVeiculo.setText("");
				campoPlaca.setText("");
				campoTempoEstimado.setText("");
			}
		});
		btnCadastraTelaPrincipal.setBounds(99, 249, 113, 23);
		TelaPrincipal.add(btnCadastraTelaPrincipal);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoNome.setText("");
				campoCPF.setText(""); 
				campoEmail.setText(""); 
				campoTelefone.setText("");
				campoTempoEstimado.setText("");
			}
		});
		btnLimpar.setBounds(222, 249, 74, 23);
		TelaPrincipal.add(btnLimpar);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(452, 249, 89, 23);
		TelaPrincipal.add(btnSair);

		JButton btnRemoverPorNome = new JButton("Remover Usu\u00E1rio");
		btnRemoverPorNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsuarioDAO removeUsuario = new UsuarioDAO();
				String exibeRemocao = JOptionPane.showInputDialog("Insira o ID do Usuário Cadastrado: ");
				if(exibeRemocao.isEmpty()){
					JOptionPane.showMessageDialog(null,"Usuário não Informado", "Remover Usuário",JOptionPane.CANCEL_OPTION);
				}else{
					removeUsuario.removePorId(Long.valueOf(exibeRemocao));
					JOptionPane.showMessageDialog(null, "O usuário " + exibeRemocao + " foi removido com sucesso!");
				}
			}
		});
		btnRemoverPorNome.setBounds(394, 121, 150, 23);
		TelaPrincipal.add(btnRemoverPorNome);

		JButton btnBuscarCadastrado = new JButton("Buscar Usuário");
		btnBuscarCadastrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioDAO buscaUsuario = new UsuarioDAO();
				String exibeBusca = JOptionPane.showInputDialog(null,"Digite uma Informação para Busca","Buscar Usuário", JOptionPane.WARNING_MESSAGE);
				if(exibeBusca.isEmpty()){
					JOptionPane.showMessageDialog(null, "Usuario não Informado ou Não existe","Buscar Usuário", JOptionPane.WARNING_MESSAGE);
				}else{
					buscaUsuario.buscarUsuario(exibeBusca);
				}
			}
		});
		btnBuscarCadastrado.setBounds(394, 96, 150, 23);
		TelaPrincipal.add(btnBuscarCadastrado);

		JButton btnExibirCadastrados = new JButton("Exibir Cadastrados");
		btnExibirCadastrados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsuarioDAO usuarioCadastrado = new UsuarioDAO();
				usuarioCadastrado.exibeCadastrados();
			}						
		});
		btnExibirCadastrados.setBounds(394, 71, 150, 23);
		TelaPrincipal.add(btnExibirCadastrados);

		JButton btnAtualizaCadastro = new JButton("Atualizar Cadastro");
		btnAtualizaCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAtualizarCadastro obj = new TelaAtualizarCadastro();
				obj.setVisible(true);
			}
		});
		btnAtualizaCadastro.setBounds(393, 146, 151, 23);
		TelaPrincipal.add(btnAtualizaCadastro);

		JLabel lblTempo = new JLabel("Tempo Estimado");
		lblTempo.setBounds(10, 221, 84, 14);
		TelaPrincipal.add(lblTempo);

		campoTempoEstimado = new JTextField();
		campoTempoEstimado.setColumns(10);
		campoTempoEstimado.setBounds(104, 218, 46, 20);
		TelaPrincipal.add(campoTempoEstimado);

		JLabel lblEmHora = new JLabel("hora(s)");
		lblEmHora.setBounds(166, 224, 46, 14);
		TelaPrincipal.add(lblEmHora);

		JLabel lblVeiculo = new JLabel("Veiculo");
		lblVeiculo.setBounds(10, 171, 84, 14);
		TelaPrincipal.add(lblVeiculo);

		campoVeiculo = new JTextField();
		campoVeiculo.setColumns(10);
		campoVeiculo.setBounds(104, 166, 134, 20);
		TelaPrincipal.add(campoVeiculo);

		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(10, 197, 84, 14);
		TelaPrincipal.add(lblPlaca);

		campoPlaca = new JTextField();
		campoPlaca.setColumns(10);
		campoPlaca.setBounds(104, 194, 134, 20);
		TelaPrincipal.add(campoPlaca);
	}
}