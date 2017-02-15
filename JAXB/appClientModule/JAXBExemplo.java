import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExemplo {
	
	public static void main(String[] args0){
		
		Cliente c1 = new Cliente();
		c1.setNome("Adriano Moda Feitosa");
		c1.setIdade(33);
		c1.setSexo('M');
		c1.setEndereco("Rua X, n.20, – FunnyLand");
		c1.setTelefone("+55853223-5995");
		
		try {
			File file = new File("C:/Users/AndroidC22/Desktop/Arquivo.xml");
			JAXBContext jabxContext = JAXBContext.newInstance(Cliente.class);
			Marshaller jaxbMarshaller = jabxContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);			
			jaxbMarshaller.marshal(c1, file);
			jaxbMarshaller.marshal(c1, System.out);		
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}		
	}
}
