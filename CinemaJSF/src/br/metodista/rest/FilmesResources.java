package br.metodista.rest;

import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import br.metodista.modelo.Filme;


@Stateless
@Path("/Filmes")
public class FilmesResources {

	private static ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
	
	static {
		Filme a1 = new Filme();
		a1.setId((long) listaFilmes.size());
		a1.setFilme("O Hobbit");
		a1.setSinopse("Filme de Aventura na Terra Média");
		a1.setGenero("Ficção/Aventura");
		a1.setDuracao(120);
		a1.setTrailer("www.hobbit.com/trailer");
		listaFilmes.add(a1);
		
		Filme a2 = new Filme();
		a2.setFilme("X-Men");
		a2.setSinopse("Filme de Mutantes Super-heróis");
		a2.setGenero("Ficção/Aventura");
		a2.setDuracao(120);
		a2.setTrailer("www.xmen.com/trailer");
		listaFilmes.add(a2);
		
	}
	
	@GET
	@Produces("application/json")
	public Collection<Filme> listaFilmes() {		
		
		return this.listaFilmes;
	}	
	
	
	@POST
	@Consumes("application/json")
	@Produces("text/plain")
	public String adicionaFilme(Filme Filme) {
		
		Filme.setId((long) this.listaFilmes.size());
		
		this.listaFilmes.add(Filme);
				
		return "Filme cadastrado";
	}	
		
	@PUT
	@Consumes("application/json")
	@Produces("text/plain")
	public String alteraFilme(Filme Filme) {	
		Filme FilmeEncontrado = this.buscaFilmePorId(Filme.getId());
		FilmeEncontrado.setFilme(Filme.getFilme());
		FilmeEncontrado.setSinopse(Filme.getSinopse());
		FilmeEncontrado.setGenero(Filme.getGenero());
		FilmeEncontrado.setDuracao(Filme.getDuracao());
		FilmeEncontrado.setTrailer(Filme.getTrailer());
				
		return "Filme alterado";
	}
	
	@Path("{id}")
	@DELETE	
	@Produces("text/plain")
	public String removeFilme(@PathParam("id") Long id) {
		
		if(listaFilmes.remove(buscaFilmePorId(id)))		
			return "Filme removido";
		else 
			return "Erro ao remover Filme";
	}	
	
	private Filme buscaFilmePorId(Long id) {
		
		Filme FilmeEncontrado = null;
		for (Filme Filme : this.listaFilmes) {
			if(Filme.getId().equals(id)) 
				FilmeEncontrado = Filme;
		}
		
		return FilmeEncontrado;
	}
}
