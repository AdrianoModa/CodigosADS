package br.unifor.ads.aluno.crud.DAO;

import java.sql.Connection; // conexão SQL para Java 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class ConnectionFactory {     
	public Connection getConnection() {         
		try {             
			return DriverManager.getConnection("jdbc:mysql://localhost/projetojava_v01","root","root");         
		}         
		catch(SQLException excecao) {             
			throw new RuntimeException(excecao);         
		}     
	} 
}