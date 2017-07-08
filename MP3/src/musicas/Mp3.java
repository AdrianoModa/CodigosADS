package musicas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Mp3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Player tocar;
	private BufferedInputStream bis;
	private InputStream input;
	private int cont = 0;
	private int faixa = 1;
	private int numPressed;
	private String[] musicas = new String[3];
	private JTextField nome;
	private JButton play;
	private JButton pause;
	private JButton parar;
	private JButton voltar;
	private JButton avancar;
	private JButton continuar;
	private JButton volume;
	private JMenuBar menuBar;
	private JMenu menuArquivo;
	private JMenuItem menuItemAbrirMusica;
	private int seletor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mp3 frame = new Mp3();
					frame.setVisible(true);
					frame.setUndecorated(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Mp3() {
		setResizable(false);

		musicas[0] = "Kalimba";
		musicas[1] = "Maid with the Flaxen Hair";
		musicas[2] = "Sleep Away";

		setTitle("Windows Media Player");
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 246);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);

		menuItemAbrirMusica = new JMenuItem("Abrir Volume...");
		menuItemAbrirMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					java.awt.Desktop.getDesktop().open(new File("C:/Windows/System32/SndVol.exe"));
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Erro ao Abrir arquivo!");
				}
			}
		});
		menuArquivo.add(menuItemAbrirMusica);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuArquivo.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		play = new JButton("");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				seletor = 1;
				Musica mp3 = new Musica();
				nome.setText("0" + faixa + " - " + musicas[cont]);
				mp3.start();
				pause.setEnabled(true);
				avancar.setVisible(true);
				faixa++;
			}
		});
		play.setIcon(new ImageIcon(Mp3.class.getResource("/imagens/play_black.png")));
		play.setBounds(10, 112, 89, 23);
		contentPane.add(play);

		pause = new JButton("");
		pause.setEnabled(false);
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tocar != null) {
					if(numPressed % 2 != 0){
						numPressed++;
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else{
						numPressed--;
						notify();
					}
				}
							
				/*synchronized(this) {
					while(tocar != null){
						tocar = null;
					}					
				}*/				
			}
		});
		pause.setIcon(new ImageIcon(Mp3.class.getResource("/imagens/pause_black.png")));
		pause.setBounds(118, 112, 89, 23);
		contentPane.add(pause);

		voltar = new JButton("");
		voltar.setVisible(false);
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont--;
				numPressed = 0;
				nome.setText("0" + faixa + " - " + musicas[cont]);
				if(true) {
					tocar.close();
					Musica mp3 = new Musica();
					mp3.start();
				}
				if(cont < 2) {
					avancar.setVisible(true);
				}
				if(cont == 0){
					voltar.setVisible(false);
				}
				faixa--;
				numPressed = 0;
			}
		});
		voltar.setIcon(new ImageIcon(Mp3.class.getResource("/imagens/skip-previous.png")));
		voltar.setBounds(226, 112, 89, 23);
		contentPane.add(voltar);

		avancar = new JButton("");
		avancar.setVisible(false);
		avancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cont++;
				numPressed = 0;
				voltar.setVisible(true);
				nome.setText("0" + faixa + " - " + musicas[cont]);
				if(true) {
					tocar.close();
					voltar.setEnabled(true);
					Musica mp3 = new Musica();
					mp3.start();
				}
				if(cont == 2) {
					avancar.setVisible(false);
				}
				faixa++;
				numPressed = 0;
			} 
		});
		avancar.setIcon(new ImageIcon(Mp3.class.getResource("/imagens/skip-next.png")));
		avancar.setBounds(334, 112, 89, 23);
		contentPane.add(avancar);

		nome = new JTextField("Media Player");
		nome.setHorizontalAlignment(SwingConstants.CENTER);
		nome.setForeground(Color.CYAN);
		nome.setBackground(Color.BLACK);
		nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nome.setBounds(10, 36, 521, 54);
		contentPane.add(nome);

		volume = new JButton("");
		volume.setIcon(new ImageIcon(Mp3.class.getResource("/imagens/volume-high.png")));
		volume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					java.awt.Desktop.getDesktop().open(new File("C:\\Windows\\System32\\SndVol.exe"));
				} catch (IOException erro) {
					erro.printStackTrace();
				}
			}
		});
		volume.setBounds(10, 146, 197, 29);
		contentPane.add(volume);

		JLabel lblMsica = new JLabel("M\u00FAsica");
		lblMsica.setBounds(10, 11, 46, 14);
		contentPane.add(lblMsica);

		parar = new JButton("Parar");
		parar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tocar.close();
			}
		});
		parar.setIcon(null);
		parar.setBounds(442, 112, 89, 23);
		contentPane.add(parar);

		continuar = new JButton("Continuar");
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tocar.notify();
			}
		});
		continuar.setBounds(226, 146, 89, 23);
		contentPane.add(continuar);
	}

	class Musica extends Thread {
		public void run() {
			try {
				input = this.getClass().getResourceAsStream("/mp3/" + musicas[cont] + ".mp3");
				bis = new BufferedInputStream(input);
				tocar = new Player(bis);
					switch (seletor) {
					case 1: tocar.play();
					case 2: try {
							tocar.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					case 3: tocar.notify();
					case 4: tocar.close();
						break;
					default:
						break;
					}
			} catch (JavaLayerException e) {
				e.printStackTrace();
			}
		}
	}
}
