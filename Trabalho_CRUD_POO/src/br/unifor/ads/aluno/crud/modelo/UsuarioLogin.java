package br.unifor.ads.aluno.crud.modelo;

public class UsuarioLogin {
	int idnome;
	String nome;
	String login;
	String senha;
	
	public int getIdnome() {
		return idnome;
	}
	public void setIdnome(int idnome) {
		this.idnome = idnome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}