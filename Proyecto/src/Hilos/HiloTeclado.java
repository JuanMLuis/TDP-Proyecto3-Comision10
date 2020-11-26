package Hilos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

import GUI.GUI;
import Logica.Jugador;
import LogicaAbstracta.Entidad;

public class HiloTeclado extends Thread {

	private Jugador jugador;
	private GUI GUI;
	
	
	public HiloTeclado(GUI GUI,Jugador jugador) {
		this.jugador=jugador;
		this.GUI=GUI;
		GUI.agregarOyenteTeclas(new keyPresed());
		GUI.requestFocus();
	}

	

	@Override
	

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

			//jugador.turno();
			
				
		}
	}
	
	private class keyPresed implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case 39:jugador.setDireccion('d');
			break;
			case 37:jugador.setDireccion('a');
			break;
			case 68:jugador.setDireccion('d');
			break;
			case 65:jugador.setDireccion('a');
			break;
		        }
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	      
	        }
	
	    
}
