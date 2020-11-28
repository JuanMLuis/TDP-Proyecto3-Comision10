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
	private JLabel lblNewLabel;
	private Jugador jugador;
	private Juego juego;
	private JLabel Vida;
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
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\fondoNivel2 .jpg"));
		lblNewLabel.setBounds(0, 0, 770, 540);
		contentPane.add(lblNewLabel);
				
		requestFocusInWindow();
		
		Vida= new JLabel();
		Vida.setForeground(Color.WHITE);
		lblNewLabel.add(Vida);
		Vida.setBounds(0,-30,130,100);
	}
	
	public JLabel getlabel() {
		return lblNewLabel;
	}

	public void agregarOyenteTeclas(KeyListener kl) {
		addKeyListener(kl);
	}
	public void actualizarVida(int a) {
		String aux=("Daño Recibido:"+a+"%");
		Vida.setText(aux);
	}

	public void Perder() {
		JLabel aAgregar= new JLabel("perdistes"); //poner imagen de game over
		aAgregar.setBounds(50,50,300,300);			//agregar botones de Game Over 
		aAgregar.setForeground(Color.white);
		lblNewLabel.add(aAgregar);
		
	}
	
}
