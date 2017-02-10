package br.somar.swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import java.awt.Font;

public class SomaSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN2;
	private JTextField txtN1;
	private JTextField txtSub1;
	private JTextField txtMult1;
	private JTextField txtDiv1;
	private JTextField txtSub2;
	private JTextField txtMult2;
	private JTextField txtDiv2;
	private JTextField textResAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomaSwing frame = new SomaSwing();
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
	public SomaSwing() {

		setTitle("Calculadora Básica");
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 469, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtN2 = new JTextField();
		txtN2.setBounds(165, 50, 89, 23);
		contentPane.add(txtN2);
		txtN2.setColumns(5);

		JLabel label = new JLabel("+");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(119, 46, 28, 30);
		contentPane.add(label);

		txtN1 = new JTextField();
		txtN1.setBounds(20, 50, 89, 23);
		contentPane.add(txtN1);
		txtN1.setColumns(5);


		JButton btnSoma = new JButton("=");

		btnSoma.setBounds(276, 50, 46, 23);
		contentPane.add(btnSoma);

		JLabel lblResSoma = new JLabel("0");
		lblResSoma.setHorizontalAlignment(SwingConstants.CENTER);
		lblResSoma.setBounds(339, 54, 46, 14);
		contentPane.add(lblResSoma);

		JTextPane txtpnSomandoDoisNmeros = new JTextPane();
		txtpnSomandoDoisNmeros.setEditable(false);
		txtpnSomandoDoisNmeros.setBackground(UIManager.getColor("Button.background"));
		txtpnSomandoDoisNmeros.setText("Somando Dois N\u00FAmeros");
		txtpnSomandoDoisNmeros.setBounds(20, 15, 234, 20);
		contentPane.add(txtpnSomandoDoisNmeros);

		txtSub1 = new JTextField();
		txtSub1.setColumns(5);
		txtSub1.setBounds(20, 111, 89, 23);
		contentPane.add(txtSub1);

		txtMult1 = new JTextField();
		txtMult1.setColumns(5);
		txtMult1.setBounds(20, 171, 89, 23);
		contentPane.add(txtMult1);

		txtDiv1 = new JTextField();
		txtDiv1.setColumns(5);
		txtDiv1.setBounds(20, 227, 89, 23);
		contentPane.add(txtDiv1);

		txtSub2 = new JTextField();
		txtSub2.setColumns(5);
		txtSub2.setBounds(165, 112, 89, 23);
		contentPane.add(txtSub2);

		txtMult2 = new JTextField();
		txtMult2.setColumns(5);
		txtMult2.setBounds(165, 172, 89, 23);
		contentPane.add(txtMult2);

		txtDiv2 = new JTextField();
		txtDiv2.setColumns(5);
		txtDiv2.setBounds(165, 228, 89, 23);
		contentPane.add(txtDiv2);

		JLabel label_1 = new JLabel("-");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(119, 111, 28, 30);
		contentPane.add(label_1);

		JLabel lblX = new JLabel("x");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(119, 171, 28, 30);
		contentPane.add(lblX);

		JLabel label_3 = new JLabel("/");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(119, 227, 28, 30);
		contentPane.add(label_3);

		JButton btnSub = new JButton("=");
		btnSub.setBounds(276, 111, 46, 23);
		contentPane.add(btnSub);

		JButton btnMult = new JButton("=");
		btnMult.setBounds(276, 171, 46, 23);
		contentPane.add(btnMult);

		JButton btnDiv = new JButton("=");
		btnDiv.setBounds(276, 227, 46, 23);
		contentPane.add(btnDiv);

		JLabel lblResSub = new JLabel("0");
		lblResSub.setHorizontalAlignment(SwingConstants.CENTER);
		lblResSub.setBounds(339, 115, 46, 14);
		contentPane.add(lblResSub);

		JLabel lblResMult = new JLabel("0");
		lblResMult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResMult.setBounds(339, 175, 46, 14);
		contentPane.add(lblResMult);

		JLabel lblResDiv = new JLabel("0");
		lblResDiv.setHorizontalAlignment(SwingConstants.CENTER);
		lblResDiv.setBounds(339, 231, 46, 14);
		contentPane.add(lblResDiv);

		JTextPane txtpnSubtraindoDoisNmeros = new JTextPane();
		txtpnSubtraindoDoisNmeros.setEditable(false);
		txtpnSubtraindoDoisNmeros.setText("Subtraindo Dois N\u00FAmeros");
		txtpnSubtraindoDoisNmeros.setBackground(UIManager.getColor("Button.background"));
		txtpnSubtraindoDoisNmeros.setBounds(20, 80, 234, 20);
		contentPane.add(txtpnSubtraindoDoisNmeros);

		JTextPane txtpnMultiplicandoDoisNmeros = new JTextPane();
		txtpnMultiplicandoDoisNmeros.setEditable(false);
		txtpnMultiplicandoDoisNmeros.setText("Multiplicando Dois N\u00FAmeros");
		txtpnMultiplicandoDoisNmeros.setBackground(UIManager.getColor("Button.background"));
		txtpnMultiplicandoDoisNmeros.setBounds(20, 145, 234, 20);
		contentPane.add(txtpnMultiplicandoDoisNmeros);

		JTextPane txtpnDividindoDoisNmeros = new JTextPane();
		txtpnDividindoDoisNmeros.setEditable(false);
		txtpnDividindoDoisNmeros.setText("Dividindo Dois N\u00FAmeros");
		txtpnDividindoDoisNmeros.setBackground(UIManager.getColor("Button.background"));
		txtpnDividindoDoisNmeros.setBounds(20, 205, 234, 20);
		contentPane.add(txtpnDividindoDoisNmeros);

		textResAll = new JTextField();
		textResAll.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textResAll.setHorizontalAlignment(SwingConstants.TRAILING);
		textResAll.setBounds(20, 278, 297, 67);
		contentPane.add(textResAll);
		textResAll.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResAll.setText(" ");
			}
		});
		btnLimpar.setBounds(355, 278, 96, 23);
		contentPane.add(btnLimpar);

		JButton btnLimparAll = new JButton("Limpar Tudo");
		btnLimparAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtN1.setText("");
				txtN2.setText("");
				txtSub1.setText("");
				txtSub2.setText("");
				txtMult1.setText("");
				txtMult2.setText("");
				txtDiv1.setText("");
				txtDiv2.setText("");
				textResAll.setText(" ");
				lblResSoma.setText("0");
				lblResSub.setText("0");
				lblResMult.setText("0");
				lblResDiv.setText("0");
			}
		});
		btnLimparAll.setBounds(327, 309, 124, 23);
		contentPane.add(btnLimparAll);

		// Cálculo do Botão Somar
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double n1 = Double.parseDouble(txtN1.getText());
				double n2 = Double.parseDouble(txtN2.getText());
				double s = n1 + n2;

				lblResSoma.setText(Double.toString(s));
				textResAll.setText(Double.toString(s));

			}
		});

		// Cálculo do Botão Subtrair

		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double n1 = Double.parseDouble(txtSub1.getText());
				double n2 = Double.parseDouble(txtSub2.getText());
				double s = n1 - n2;

				lblResSub.setText(Double.toString(s));
				textResAll.setText(Double.toString(s));
			}
		});

		// Cálculo do Botão Multiplicar

		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double n1 = Double.parseDouble(txtMult1.getText());
				double n2 = Double.parseDouble(txtMult2.getText());
				double s = n1 * n2;

				lblResMult.setText(Double.toString(s));
				textResAll.setText(Double.toString(s));
			}
		});

		// Cálculo do Botão Dividir

		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double n1 = Double.parseDouble(txtDiv1.getText());
				double n2 = Double.parseDouble(txtDiv2.getText());
				double s = n1 / n2;

				lblResDiv.setText(Double.toString(s));
				textResAll.setText(Double.toString(s));
			}
		});

	}
}
