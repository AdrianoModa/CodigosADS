package br.unifor.ads.aluno.crud.DAO;

import br.unifor.ads.aluno.crud.modelo.UsuarioLogin;
import java.sql.*;
import javax.swing.JOptionPane;
import br.unifor.ads.aluno.crud.GUI.views.TelaCadastrarUsuario;

/**
 * @author Adriano Moda Feitosa
 * @since 25/11/2016
 * @version
 */

public class UsuarioLoginDAO {
	private Connection connection;
	int id;
	String nome;
	String login;
	String senha;

	public UsuarioLoginDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastraLogin(UsuarioLogin cadastroLogin){

		String sql = "INSERT INTO tb_login(nome,login,senha) values(?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cadastroLogin.getNome());
			stmt.setString(2, cadastroLogin.getLogin());
			stmt.setString(3, cadastroLogin.getSenha());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}	

	public void validarLogin(String vlogin, String vsenha){
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM tb_login WHERE "
					+ "login = ? and senha = ?");
			stmt.setString(1, vlogin);
			stmt.setString(2, vsenha);
			ResultSet consulta = stmt.executeQuery();
			while(consulta.next()){
				if(consulta.getString("login").equals(vlogin) && consulta.getString("senha").equals(vsenha)){
					TelaCadastrarUsuario tprincipal = new TelaCadastrarUsuario();
					tprincipal.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "Login", "Login ou senha inválidos!",JOptionPane.ERROR_MESSAGE);
				}
			}
			stmt.close();
		} catch (SQLException u) {			
			JOptionPane.showMessageDialog(null, "Login", "Login ou senha inválidos!",JOptionPane.ERROR_MESSAGE);
		}
	}
}		