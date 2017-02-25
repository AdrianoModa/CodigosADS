package com.exemplo.views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class TelaAtualizar extends JFrame {

	/**
	 * @author AndroidC22
	 * @since 18/02/2017
	 */

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAtualizar;
	private JButton btnVoltar;
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
	private JTextField campoID;

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				TelaAtualizar frame = new TelaAtualizar();
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

	public TelaAtualizar(){
		setTitle("Cadastro Cliente");
		setResizable(false);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setBounds(250, 100, 489, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		btnAtualizar = new JButton();
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(campoNome.getText().isEmpty() || campoIdade.getText().isEmpty() || campoEndereco.getText().isEmpty() 
						|| campoTelefone.getText().isEmpty() || campoRg.getText().isEmpty() || campoCpf.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Os campos não podem ficar vazios", "Erro", JOptionPane.WARNING_MESSAGE);
				}else{					
					repositorioCliente = new RepositorioCliente();
					cliente = repositorioCliente.obterPorId(Integer.valueOf(campoID.getText()));
					cliente.setNome(campoNome.getText());
					cliente.setIdade(Integer.valueOf(campoIdade.getText()));
					cliente.setEndereco(campoEndereco.getText());
					cliente.setTelefone(campoTelefone.getText());
					cliente.setRg(campoRg.getText());
					cliente.setCpf(campoCpf.getText());
					repositorioCliente.salvar(cliente);
					JOptionPane.showMessageDialog(null, "Cadastro Atualizado com Sucesso!","Atualizar Cadastro", JOptionPane.INFORMATION_MESSAGE);
					TelaPrincipal telaPrincipal = new TelaPrincipal();
					telaPrincipal.limpaCampos();
				}
			}
		});
		btnAtualizar.setText("Atualizar");
		btnAtualizar.setBounds(335, 140, 125, 30);
		contentPane.add(btnAtualizar);

		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaPrincipal telaPrincipal = new TelaPrincipal();
				telaPrincipal.setVisible(true);
			}
		});
		btnVoltar.setBounds(335, 194, 125, 30);
		contentPane.add(btnVoltar);

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
		
		JLabel lblId = new JLabel("ID do Cliente");
		lblId.setBounds(335, 45, 66, 14);
		contentPane.add(lblId);
		
		campoID = new JTextField();
		campoID.setBounds(404, 45, 56, 20);
		contentPane.add(campoID);
		campoID.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(335, 242, 125, 30);
		contentPane.add(btnSair);
	}
}
