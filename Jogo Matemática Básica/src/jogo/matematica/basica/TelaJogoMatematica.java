package jogo.matematica.basica;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaJogoMatematica extends JFrame {

	/**
	 * @author Adriano Moda Feitosa
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int calcSoma;
	int calcSubtracao;
	int calcMultiplicacao;
	float calcDivisao;
	int sortear;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogoMatematica frame = new TelaJogoMatematica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaJogoMatematica() {
		setTitle("Jogo Matemática");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 294);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblResolva = new JLabel("Resolva:");
		lblResolva.setBounds(32, 11, 68, 14);
		contentPane.add(lblResolva);

		JTextField Parcela1 = new JTextField("");
		Parcela1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Parcela1.setBounds(32, 36, 68, 34);
		contentPane.add(Parcela1);

		JLabel operadorAritmetico = new JLabel("+");
		operadorAritmetico.setBounds(137, 48, 17, 14);
		contentPane.add(operadorAritmetico);

		JLabel lblIgual = new JLabel("=");
		lblIgual.setBounds(297, 48, 17, 14);
		contentPane.add(lblIgual);

		JTextField Parcela2 = new JTextField();
		Parcela2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Parcela2.setBounds(185, 36, 68, 34);
		contentPane.add(Parcela2);

		JTextField Resultado = new JTextField("");
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Resultado.setBounds(336, 36, 68, 34);
		contentPane.add(Resultado);

		JLabel lblMensagem = new JLabel("Mensagem");
		lblMensagem.setBounds(32, 119, 68, 14);
		contentPane.add(lblMensagem);

		JButton btnIniciarJogo = new JButton("Iniciar Jogo");
		btnIniciarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				int rp1 = random.nextInt(12);
				int rp2 = random.nextInt(10);
				sortear = random.nextInt(4);
				int aux;
				// Não possuir subtração que resultem em negativo, ou seja, menor subtrai de maior
				if( rp2 > rp1 ){
					aux = rp2;
					rp2 = rp1;
					rp1 = aux;
				}
				// Não possuir divisão por zero
				if(sortear == 3){
					if(rp2 == 0){
						aux = rp2;
						rp2 = rp1;
						rp1 = aux;
					}
					// Força divisão exata
					if(sortear == 3){
						if(rp1 % rp2 != 0){
							for(int i = rp1; rp1 > rp2; rp1--){
								if(rp1 % rp2 == 0){
									rp1 = i;
								}
							}
						}
					}
				}
				Parcela1.setText(String.valueOf(rp1));
				Parcela2.setText(String.valueOf(rp2));
				Resultado.requestFocus();
				switch(sortear){
				case 0: calcSoma = Integer.parseInt((Parcela1.getText()))
						+ Integer.parseInt(Parcela2.getText());
				operadorAritmetico.setText("+"); break; 
				case 1:	calcSubtracao = Integer.parseInt((Parcela1.getText()))
						- Integer.parseInt(Parcela2.getText());
				operadorAritmetico.setText("-"); break;
				case 2: calcMultiplicacao = (Integer.parseInt((Parcela1.getText()))
						* Integer.parseInt(Parcela2.getText()));
				operadorAritmetico.setText("x"); break;
				case 3: calcDivisao = Float.parseFloat(Parcela1.getText()) 
						/ Float.parseFloat(Parcela2.getText());
				operadorAritmetico.setText(":"); break;
				}
			}
		});
		btnIniciarJogo.setBounds(32, 222, 211, 23);
		contentPane.add(btnIniciarJogo);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(253, 222, 151, 23);
		contentPane.add(btnSair);

		JLabel lblMsgResultado = new JLabel("");
		lblMsgResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMsgResultado.setBounds(32, 144, 310, 67);
		contentPane.add(lblMsgResultado);

		JButton btnCalcular = new JButton("Calcular!");
		getRootPane().setDefaultButton(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Parcela1.getText().isEmpty() || Parcela2.getText().isEmpty() || Resultado.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "O Jogo não foi iniciado!","Jogo Matemática",JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e) {

				}
				// Valida cálculo entre entrada de dados do usuário e o computador
				try {
					if(sortear == 0){
						if(calcSoma == Integer.parseInt(Resultado.getText())){
							lblMsgResultado.setText(
									"Resposta Certa! "  + Parcela1.getText() + 
									" + " + Parcela2.getText() + " = " + calcSoma);
							Parcela1.setText("");
							Parcela2.setText("");
							Resultado.setText(null);
						}else{
							lblMsgResultado.setText(
									"Resposta Errada! "  + Parcela1.getText() + 
									" + " + Parcela2.getText() + " = " + calcSoma);
							Parcela1.setText("");
							Parcela2.setText("");
							Resultado.setText(null);
						}
					}

					if(sortear == 1){
						if(calcSubtracao == Integer.parseInt(Resultado.getText())){
							lblMsgResultado.setText(
									"Resposta Certa! "  + Parcela1.getText() + 
									" - " + Parcela2.getText() + " = " + calcSubtracao);
							Parcela1.setText("");
							Parcela2.setText("");
							Resultado.setText(null);
						}else{
							lblMsgResultado.setText(
									"Resposta Errada! "  + Parcela1.getText() + 
									" - " + Parcela2.getText() + " = " + calcSubtracao);
							Parcela1.setText("");
							Parcela2.setText("");
							Resultado.setText(null);
						}
					}

					if(sortear == 2){
						if(calcMultiplicacao == Integer.parseInt(Resultado.getText())){
							lblMsgResultado.setText(
									"Resposta Certa! "  + Parcela1.getText() + 
									" x " + Parcela2.getText() + " = " + calcMultiplicacao);
							Parcela1.setText("");
							Parcela2.setText("");
							Resultado.setText(null);
						} else{
							lblMsgResultado.setText(
									"Resposta Errada! "  + Parcela1.getText() + 
									" x " + Parcela2.getText() + " = " + calcMultiplicacao);
							Parcela1.setText("");						
							Parcela2.setText("");
							Resultado.setText(null);
						}
					}
					
					if(sortear == 3){
						if(calcDivisao == Integer.parseInt(Resultado.getText())){
							lblMsgResultado.setText(
									"Resposta Certa! "  + Parcela1.getText() + 
									" : " + Parcela2.getText() + " = " + calcDivisao);
							Parcela1.setText("");
							Parcela2.setText("");
							Resultado.setText(null);
						} else{
							lblMsgResultado.setText(
									"Resposta Errada! "  + Parcela1.getText() + 
									" : " + Parcela2.getText() + " = " + calcDivisao);
							Parcela1.setText("");						
							Parcela2.setText("");
							Resultado.setText(null);
						}
					}

				}
				catch (Exception e) {
				}
			}});
		btnCalcular.setBounds(32, 85, 372, 23);
		contentPane.add(btnCalcular);
	}}
