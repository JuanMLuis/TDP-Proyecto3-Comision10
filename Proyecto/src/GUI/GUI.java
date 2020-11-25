package GUI;

import java.awt.BorderLayout;
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

public class GUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private Jugador jugador;
	private Juego juego;
	
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
		lblNewLabel.setIcon(new ImageIcon("img\\fondoNivel1.jpg"));
		lblNewLabel.setBounds(0, 0, 770, 540);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
	
	public JLabel getlabel() {
		return lblNewLabel;
	}
	
	public void moverJugador(KeyEvent e) {
		int x=jugador.getCorx();
		int y=jugador.getCorY();
		
		switch(e.getExtendedKeyCode()) {
		case KeyEvent.VK_RIGHT:jugador.moverse('d');
		case KeyEvent.VK_LEFT:jugador.moverse('a');
		case KeyEvent.VK_D:jugador.moverse('d');
		case KeyEvent.VK_A:jugador.moverse('a');
		}
	}
	
}
