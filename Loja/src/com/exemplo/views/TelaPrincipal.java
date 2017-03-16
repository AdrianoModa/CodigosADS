package com.exemplo.views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import com.exemplo.entidade.Cliente;
import com.exemplo.entidade.repositorio.RepositorioCliente;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class TelaPrincipal extends JFrame {

	/**
	 * @author AndroidC22
	 * @since 18/02/2017
	 */

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCadastrar;
	private JButton btnExibir;
	private JButton btnAtualizar;
	private JButton btnRemover;
	private JButton btnSair;
	private JButton buttonDataBase;
	private JLabel lblNome;
	private JLabel lblIdade;
	private JLabel lblEndereco;
	private JLabel lblTelefone;
	private JLabel lblRg;
	private JLabel lblCpf;
	private JTextField campoNome;
	private JTextField campoIdade;
	private JTextField campoEndereco;
	private JTextField campoTelefone;
	private JTextField campoRg;
	private JTextField campoCpf;
	private Cliente cliente;
	private RepositorioCliente repositorioCliente;

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				TelaPrincipal frame = new TelaPrincipal();
				frame.setVisible(true);
			}
		});
	}

	public void limpaCampos(){
		campoNome.setText("");
		campoIdade.setText("");
		campoEndereco.setText("");
		campoTelefone.setText("");
		campoRg.setText("");
		campoCpf.setText("");
	}

	public TelaPrincipal(){
		setTitle("Cadastro Cliente");
		setResizable(false);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 100, 489, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastrar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/exemplo/imagens/account-plus.png")));
		btnCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(campoNome.getText().isEmpty() || campoIdade.getText().isEmpty() || campoEndereco.getText().isEmpty() 
						|| campoTelefone.getText().isEmpty() || campoRg.getText().isEmpty() || campoCpf.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Os campos não podem ficar vazios", "Aviso", JOptionPane.WARNING_MESSAGE);
				}else{
					repositorioCliente = new RepositorioCliente();
					cliente = new Cliente();
					cliente.setNome(campoNome.getText());
					cliente.setIdade(Integer.valueOf(campoIdade.getText()));
					cliente.setEndereco(campoEndereco.getText());
					cliente.setTelefone(campoTelefone.getText());
					cliente.setRg(campoRg.getText());
					cliente.setCpf(campoCpf.getText());
					repositorioCliente.salvar(cliente);
					JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!","Cadastro",JOptionPane.INFORMATION_MESSAGE);
					limpaCampos();
				}
			}
		});
		btnCadastrar.setBounds(307, 38, 153, 30);
		contentPane.add(btnCadastrar);

		btnExibir = new JButton("Exibir Cadastrados");
		btnExibir.setHorizontalAlignment(SwingConstants.LEFT);
		btnExibir.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/exemplo/imagens/file-document-box.png")));
		btnExibir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				List<Cliente> cliente = new RepositorioCliente().listarTodos();
				String exibeCadastro = "<< Clientes Cadastrados >> \r\r\n";
				for (Cliente clientes : cliente) {
					exibeCadastro += 
							"Id do Cliente " + clientes.getId() +  "\r\n" +
									"Nome: " + clientes.getNome() + "\r\n" +
									"Idade " + clientes.getIdade() + "\r\n" +
									"Endereco: " + clientes.getEndereco() + "\r\n" +
									"Telefone: " + clientes.getTelefone() + "\r\n" +
									"RG: " + clientes.getRg() + "\r\n" +
									"CPF " + clientes.getCpf() +  "\r\n" + "\r\n";
				}
				Path caminho = Paths.get("C:/Users/AndroidC22/Desktop/Cadastrados Cliente.txt");
				byte[] lerCadastro = exibeCadastro.getBytes();
				try {
					Files.write(caminho, lerCadastro);
					java.awt.Desktop.getDesktop().open(new File("C:/Users/AndroidC22/Desktop/Cadastrados Cliente.txt"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnExibir.setBounds(307, 87, 153, 30);
		contentPane.add(btnExibir);	

		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAtualizar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/exemplo/imagens/file-restore.png")));
		btnAtualizar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
					new TelaAtualizar().setVisible(true);
					new TelaPrincipal().setEnabled(false);
			}
		});
		btnAtualizar.setBounds(307, 140, 153, 30);
		contentPane.add(btnAtualizar);

		btnRemover = new JButton();
		btnRemover.setHorizontalAlignment(SwingConstants.LEFT);
		btnRemover.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/exemplo/imagens/delete-forever.png")));
		btnRemover.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				int idRemover = Integer.valueOf(JOptionPane.showInputDialog(null, "Entre com o ID do Cliente para Remover!"));
				RepositorioCliente repositorioClienteRemover = new RepositorioCliente();
				Cliente clienteRemover = repositorioClienteRemover.obterPorId(idRemover);
				repositorioClienteRemover.remover(clienteRemover);
				JOptionPane.showMessageDialog(null,"Cliente Removido com Sucesso!","Remover Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnRemover.setText("Remover");
		btnRemover.setBounds(307, 194, 153, 30);
		contentPane.add(btnRemover);

		btnSair = new JButton("Sair");
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/exemplo/imagens/exit-to-app.png")));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(307, 242, 153, 30);
		contentPane.add(btnSair);

		buttonDataBase = new JButton("");
		buttonDataBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.awt.Desktop.getDesktop().open(new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\MySQL\\MySQL Server 5.7\\MySQL 5.7 Command Line Client.lnk"));
				} catch (IOException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao Abrir o Arquivo","Erro",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		buttonDataBase.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/exemplo/imagens/database-plus.png")));
		buttonDataBase.setBounds(424, 290, 36, 27);
		contentPane.add(buttonDataBase);

		lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 45, 66, 14);
		contentPane.add(lblNome);

		lblIdade = new JLabel("Idade: ");
		lblIdade.setBounds(10, 87, 66, 14);		
		contentPane.add(lblIdade);

		lblEndereco = new JLabel("Endereco: ");
		lblEndereco.setBounds(10, 171, 66, 14);
		contentPane.add(lblEndereco);

		lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(10, 129, 66, 14);
		contentPane.add(lblTelefone);		

		lblRg = new JLabel("RG: ");
		lblRg.setBounds(10, 213, 66, 14);
		contentPane.add(lblRg);

		lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(10, 255, 66, 14);
		contentPane.add(lblCpf);	

		campoNome = new JTextField();
		campoNome.setBounds(70, 45, 200, 20);
		contentPane.add(campoNome);

		campoIdade = new JTextField();
		campoIdade.setBounds(70, 87, 200, 20);
		contentPane.add(campoIdade);

		campoTelefone = new JTextField();
		campoTelefone.setBounds(70, 129, 200, 20);
		contentPane.add(campoTelefone);

		campoEndereco = new JTextField();
		campoEndereco.setBounds(70, 171, 200, 20);
		contentPane.add(campoEndereco);

		campoRg = new JTextField();
		campoRg.setBounds(70, 213, 200, 20);
		contentPane.add(campoRg);

		campoCpf = new JTextField();
		campoCpf.setBounds(70, 255, 200, 20);
		contentPane.add(campoCpf);
	}
}
