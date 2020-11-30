package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Juego;
import Juego.Nivel;
import Logica.Jugador;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JLabel l_fondo;
	private Jugador jugador;
	private Juego juego;
	private JLabel Vida;
	private JLabel aAgregar;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\hiclipart.com (2).png"));
		setResizable(false);
		setTitle("Star Wars: Rise of the empire");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l_fondo = new JLabel("");
		l_fondo.setIcon(new ImageIcon("img\\fondoNivel2 .jpg"));
		l_fondo.setBounds(0, 0, 770, 540);
		contentPane.add(l_fondo);
				
		requestFocusInWindow();
		
		Vida= new JLabel();
		Vida.setForeground(Color.WHITE);
		l_fondo.add(Vida);
		Vida.setBounds(0,-30,130,100);
	}
	
	public JLabel getlabel() {
		return l_fondo;
	}

	public void agregarOyenteTeclas(KeyListener kl) {
		addKeyListener(kl);
	}
	public void actualizarVida(int a) {
		String aux=("Da�o Recibido:"+a+"%");
		Vida.setText(aux);
	}

	public void Perder() {
		
		aAgregar= new JLabel(""); 
		aAgregar.setIcon(new ImageIcon("img\\perdiste.png"));
		aAgregar.setBounds(110,120,550,300);//agregar botones de Game Over 
		l_fondo.add(aAgregar);
		aAgregar.setVisible(true);
		this.repaint();
	}
	
}
