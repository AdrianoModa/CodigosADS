import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExemplo {
	
	/**
	 * @author Adriano Moda
	 * @since 21/02/2017
	 */
	
	public static void main(String[] args0){
		
		Cliente c1 = new Cliente();
		c1.setNome("Adriano Moda Feitosa");
		c1.setIdade(34);
		c1.setSexo('M');
		c1.setEndereco("Rua Y, n.2220, � FunnyLand");
		c1.setTelefone("+55853223-5995");
		
		try {
			File arquivoXml = new File("C:/Users/AndroidC22/Desktop/Arquivo.xml");
			JAXBContext jabxContext = JAXBContext.newInstance(Cliente.class);
			Marshaller jaxbMarshaller = jabxContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);			
			jaxbMarshaller.marshal(c1, arquivoXml);
			jaxbMarshaller.marshal(c1, System.out);		
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}		
	}
}