package br.unifor.arq.facade;

import java.io.File;
import java.io.IOException;

public class SistemaDeAudio {

	public void configurarCanais() {
		
	}

	public void configurarFrequencia() {
		
	}

	public void configurarVolume() {
		
	}

	public void reproduzirAudio(String audio) {
		try {
			java.awt.Desktop.getDesktop().open(new File(audio));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
