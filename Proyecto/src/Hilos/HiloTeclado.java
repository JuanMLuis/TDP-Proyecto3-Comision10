package Hilos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

import Logica.Jugador;
import LogicaAbstracta.Entidad;

public class HiloTeclado extends Thread implements KeyListener {

	private Jugador jugador;
	private JFrame GUI;
	
	
	public HiloTeclado(JFrame GUI,Jugador jugador) {
		this.jugador=jugador;
		this.GUI=GUI;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Guille gil");
		switch(e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:jugador.setDireccion('d');
		case KeyEvent.VK_LEFT:jugador.setDireccion('a');
		case KeyEvent.VK_D:jugador.setDireccion('d');
		case KeyEvent.VK_A:jugador.setDireccion('a');
		}
		jugador.turno();
		
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		boolean fin=false;
		jugador.setDireccion('d');
		while(!fin){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jugador.turno();
			
				
		}
	}

}
