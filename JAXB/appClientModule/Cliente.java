import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente {	
	
	int id;
	String nome;
	int idade;
	char sexo;
	String endereco;
	String telefone;
	
	public int getId() {
		return id;
	}
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	@XmlElement
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	@XmlElement
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo() {
		return sexo;
	}
	@XmlElement
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getEndereco() {
		return endereco;
	}
	@XmlElement
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	@XmlElement
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}		
}