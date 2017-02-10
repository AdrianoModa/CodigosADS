package br.unifor.ads.aluno.crud.DAO;

import br.unifor.ads.aluno.crud.modelo.Usuario;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * @author Adriano Moda Feitosa
 * @since 25/11/2016
 * @version
 */

public class UsuarioDAO {
	private Connection connection;
	Long id;
	String nome;
	String cpf;
	String email;
	String telefone;

	public UsuarioDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Usuario adicionar){

		String sql = "INSERT INTO usuario(nome,cpf,email,telefone,nome_veiculo,placa) VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, adicionar.getNome());
			stmt.setString(2, adicionar.getCpf());
			stmt.setString(3, adicionar.getEmail());
			stmt.setString(4, adicionar.getTelefone());
			stmt.setString(5, adicionar.getNome_veiculo());
			stmt.setString(6, adicionar.getPlaca());
			stmt.execute();
			stmt.close();	
			System.out.println("Dados inserido com Sucesso!");
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public void removePorId(Long id){

		String sql = "DELETE FROM usuario WHERE id = " + id;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}

	public void atualiza(Usuario atualizar){

		String sql = "UPDATE usuario SET nome = ? , cpf = ?, email = ?, telefone = ?, nome_veiculo = ?, placa = ?"
				+ "WHERE id = " + atualizar.getId();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, atualizar.getNome());
			stmt.setString(2, atualizar.getCpf());
			stmt.setString(3, atualizar.getEmail());
			stmt.setString(4, atualizar.getTelefone());
			stmt.setString(5, atualizar.getNome_veiculo());
			stmt.setString(6, atualizar.getPlaca());
			stmt.executeUpdate();
			stmt.close();	
			System.out.println("Dados atualizados com Sucesso!");
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}


	public void exibeCadastrados(){

		String sql = "SELECT * FROM usuario";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet cadastrado = stmt.executeQuery(sql);
			String exibeCadastro = "Todos os Cadastrados: \r\n";
			while(cadastrado.next()){
				exibeCadastro += 
						"ID do Usuário: " + cadastrado.getLong("id") + "\r\n" +
								 "Nome: " + cadastrado.getString("nome") + "\r\n" +
								  "CPF: " + cadastrado.getString("cpf") + "\r\n" +
							   "E-mail: " + cadastrado.getString("email") + "\r\n" +
						     "Telefone: " + cadastrado.getString("telefone") + "\r\n" + 
				      "Nome do Veículo: " + cadastrado.getString("nome_veiculo") + "\r\n" +
					 "Placa do Veículo: " + cadastrado.getString("placa") + "\r\n" + "\r\n";
			}
			if(cadastrado.next() == true){
				JOptionPane.showMessageDialog(null, "Não há usuários cadastrados!","Exibir Cadastrados",JOptionPane.WARNING_MESSAGE);
			}else{
				Path caminhoArquivo = Paths.get("C:/Users/AndroidC22/Desktop/Cadastrados no Banco.txt");
				byte[] lerExibeCadastro = exibeCadastro.getBytes();
				Files.write(caminhoArquivo, lerExibeCadastro);
				java.awt.Desktop.getDesktop().open(new File("C:/Users/AndroidC22/Desktop/Cadastrados no Banco.txt"));
			}
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void buscarUsuario(String nome){
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM usuario WHERE nome LIKE ?");
			stmt.setString(1,"%" + nome + "%");
			ResultSet consulta = stmt.executeQuery();
			String exibepesquisa = "Pesquisa: \n";
			while(consulta.next()){
				exibepesquisa += 
						"ID do Usuário: " + consulta.getLong("id") + "\n" +
								"Nome: " + consulta.getString("nome") + "\n" +
								"CPF: " + consulta.getString("cpf") + "\n" +
								"E-mail: " + consulta.getString("email") + "\n" +
								"Telefone " + consulta.getString("telefone") + "\n" + 
								"Nome do Veículo " + consulta.getString("nome_veiculo") + "\n" +
								"Placa do Veículo " + consulta.getString("placa") + "\n";
			}
			JOptionPane.showMessageDialog(null, exibepesquisa);
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
}