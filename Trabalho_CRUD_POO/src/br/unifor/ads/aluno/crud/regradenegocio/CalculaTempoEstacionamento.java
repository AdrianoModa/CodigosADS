package br.unifor.ads.aluno.crud.regradenegocio;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JOptionPane;

public class CalculaTempoEstacionamento {		
	
	double preco;
	
	public void calculaPreco(int tempo){
		
		DecimalFormat df = new DecimalFormat("0.##");
		GregorianCalendar gc = new GregorianCalendar();
		gc.getTime(); 
		gc.add(Calendar.HOUR_OF_DAY,tempo);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss, d MMM yyyy");
		
		if(gc.DAY_OF_WEEK > 1 || gc.DAY_OF_WEEK < 7){
			if(gc.HOUR_OF_DAY > 07 && gc.HOUR_OF_DAY <=12){			
				preco = tempo*2.6;
				JOptionPane.showMessageDialog(null, " Saída: " + sdf.format(gc.getTime()) + 
						"\n Preco: R$ " + df.format(preco) + " reais","Aviso",JOptionPane.WARNING_MESSAGE);
			}else{
				preco = tempo*2;
				JOptionPane.showMessageDialog(null, " Saída: " + sdf.format(gc.getTime()) + 
						"\n Preco: R$ " + df.format(preco) + " reais","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		}	
		
		if(gc.DAY_OF_WEEK == 7 && gc.DAY_OF_WEEK == 1){
			preco = tempo*3;
			JOptionPane.showMessageDialog(null, " Saída: " + sdf.format(gc.getTime()) + 
					"\n Preco: R$ " + df.format(preco) + " reais","Aviso",JOptionPane.WARNING_MESSAGE);
		}
	}	
}
