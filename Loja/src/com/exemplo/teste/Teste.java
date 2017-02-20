package com.exemplo.teste;

import java.util.List;

import javax.swing.JOptionPane;

import com.exemplo.entidade.Cliente;
import com.exemplo.entidade.repositorio.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {
		
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		Cliente cliente = new Cliente();
		
		String cadCliente = JOptionPane.showInputDialog(null, "Entre com o nome do Cliente:");
		String cadIdade = JOptionPane.showInputDialog(null, "Entre com a idade do Cliente:");
		String cadRg = JOptionPane.showInputDialog(null, "Entre com o RG do Cliente:");
		cliente.setNome(cadCliente);
		cliente.setIdade(Integer.valueOf(cadIdade));
		cliente.setRg(cadRg);
		
		repositorioCliente.salvar(cliente); // adiciona o cliente
		
		List<Cliente> clientes = new RepositorioCliente().listarTodos(); // exibe o(s) cliente(s)
		
		for (Cliente cliente1 : clientes) {
			System.out.println("Cliente: " + cliente1.getNome());
			System.out.println("Idade: " + cliente1.getIdade());
		}	
				
		Cliente cliente1 = repositorioCliente.obterPorId(1);
		cliente1.setNome("Fernando Pessoa");		
		repositorioCliente.salvar(cliente1); // Atualiza o cliente	

		System.out.println(cliente1.getNome());	
		
		Cliente cliente2 = repositorioCliente.obterPorId(1);
		repositorioCliente.remover(cliente2); // Remove um cliente
		
		/* Ao final desse ele vai criar, exibir, atualizar e por fim remover esse cliente 
		 * Saída do console é esta:
		 * Hibernate: 
			    insert 
			    into
			        cliente
			        (idade, nome) 
			    values
			        (?, ?)

			Hibernate: 
			    select
			        cliente0_.id as id2_,
			        cliente0_.idade as idade2_,
			        cliente0_.nome as nome2_ 
			    from
			        cliente cliente0_
			
			Nome: Frodo Bolseiro
			Idade: 50
			
			Hibernate: 
			    select
			        cliente0_.id as id0_0_,
			        cliente0_.idade as idade0_0_,
			        cliente0_.nome as nome0_0_ 
			    from
			        cliente cliente0_ 
			    where
			        cliente0_.id=?
		 * 
		 * */
	}
}
