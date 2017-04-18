package br.metodista.managedbean;

import br.metodista.modelo.Filme;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CinemaMB {
  public List<Filme> getFilmesEmCartaz() {
    Client c = Client.create();
    WebResource wr = c.resource("http://localhost:8080/CinemaMB/servico/filmes");
    String json = wr.get(String.class);
    Gson gson = new Gson();
    return gson.fromJson(json, new TypeToken<List<Filme>>(){}.getType());
  }
}