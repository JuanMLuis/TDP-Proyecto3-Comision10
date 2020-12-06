package GUI;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Juego.Juego;
import Logica.Jugador;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.applet.AudioClip;

public class GUI extends JFrame {

	private JPanel contentPane;
	private static JLabel l_fondo;
	private Jugador jugador;
	private Juego juego;
	private JLabel Vida;
	private JLabel aAgregar;
	private static JLabel l_nivel = new JLabel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
		setResizable(false);
		setTitle("Star Wars: Rise of the empire");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		l_fondo = new JLabel("");
		l_fondo.setIcon(new ImageIcon("img\\fondoNivel1.jpg"));
		l_fondo.setBounds(0, 0, 770, 540);
		contentPane.add(l_fondo);

		requestFocusInWindow();

		Vida= new JLabel();
		Vida.setForeground(Color.WHITE);
		Vida.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		l_fondo.add(Vida);
		Vida.setBounds(0,-30,130,100);


		l_fondo.add(l_nivel);
		l_nivel.setBounds(710,-30,500,100);
		l_nivel.setForeground(Color.WHITE);
		l_nivel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));



	}

	public JLabel getlabel() {
		return l_fondo;
	}

	public void agregarOyenteTeclas(KeyListener kl) {
		addKeyListener(kl);
	}
	public void actualizarVida(int a) {
		if(a<0)
			a=0;
		String aux=("Vida:"+a+"%");
		Vida.setText(aux);
	}

	public void perder() {
		aAgregar= new JLabel(""); 
		aAgregar.setIcon(new ImageIcon("img\\perdiste.png"));
		aAgregar.setBounds(110,120,550,300);
		l_fondo.add(aAgregar);
		aAgregar.setVisible(true);
		this.repaint();
		String[] opciones = new String[] {"Jugar de nuevo","Salir"};
		int x=JOptionPane.showOptionDialog(null, "Has perdido!, �que deseas hacer?", "Informaci�n adicional",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, opciones, opciones[0]);
		switch(x){
		case 1://Ayuda en este caso no se como conectarlo con el hilo para que arranque de nuevo :C
			this.dispose();
			juego= new Juego(this);
			juego.startJuego();
			break;
		case 2:
			this.dispose();
		}
	}

	public void ganar() {
		aAgregar= new JLabel(""); 
		aAgregar.setIcon(new ImageIcon("img\\ganaste.png"));
		aAgregar.setBounds(110,120,550,300);
		l_fondo.add(aAgregar);
		aAgregar.setVisible(true);
		this.repaint();
		String[] opciones = new String[] {"Jugar de nuevo","Salir"};
		int x=JOptionPane.showOptionDialog(null, "Felicidades! Has ganado, �que deseas hacer?", "Informaci�n adicional",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, opciones, opciones[0]);
		switch(x){
		case 1://Ayuda en este caso no se como conectarlo con el hilo para que arranque de nuevo :C
			this.dispose();
			juego= new Juego(this);
			juego.startJuego();
			break;
		case 2:
			this.dispose();
		}
	}

	public static void setearNivel(String s) {
		l_nivel.setText(s);
	}

	public static void cambiarFondo(String ruta) {
		l_fondo.setIcon(new ImageIcon(ruta));
	}

}
