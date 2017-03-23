package br.unifor.arq.facade;

import java.io.File;
import java.io.IOException;

public class SistemaDeVideo {

	public void configurarCores() {
		
	}

	public void configurarResolucao() {
		
	}

	public void renderizarImagem(String imagem) {
		try {
			java.awt.Desktop.getDesktop().open(new File(imagem));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
