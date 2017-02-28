package br.com.k19.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/bandas")
public class BandaResource { 

	static private HashMap<Integer,Banda> bandasMap;

	static {
		bandasMap = new HashMap<Integer, Banda>();
		Banda b1 = new Banda();
		b1.setId(1);
		b1.setNome("Led Zeppelin");
		b1.setAnoDeFormacao(1968);
		bandasMap.put(b1.getId(), b1);
		Banda b2 = new Banda();
		b2.setId(2);
		b2.setNome("AC/DC");
		b2.setAnoDeFormacao(1973);
		bandasMap.put(b2.getId(), b2);
		Banda b3 = new Banda();
		b3.setId(3);
		b3.setNome("Iron Maiden");
		b3.setAnoDeFormacao(1978);
		bandasMap.put(b3.getId(), b3);
		Banda b4 = new Banda();
		b4.setId(4);
		b4.setNome("Skid Row");
		b4.setAnoDeFormacao(1986);
		bandasMap.put(b4.getId(), b4);
		Banda b5 = new Banda();
		b5.setId(5);
		b5.setNome("Bon Jovi");
		b5.setAnoDeFormacao(1984);
		bandasMap.put(b5.getId(), b5);
	}

	@GET
	@Produces("text/xml")
	public List<Banda> getBandas() {
		return new ArrayList<Banda>(bandasMap.values());
	}

	@Path("{id}")
	@GET
	@Produces("text/xml")
	public Banda getBanda(@PathParam("id") int id) {
		return bandasMap.get(id);
	}	
}
