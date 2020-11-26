package Juego;

import GUI.GUI;
import Hilos.HiloTeclado;
import Logica.Jugador;


public class Juego {
	protected GUI miGui;
	protected Nivel miNivel;
	protected Jugador jugador;
	
	
	public Juego(GUI g) {
		miGui=g;
		miNivel=new Nivel1(this);
		jugador= new Jugador(miNivel);
	}
	
	
	public void setGUI(GUI g) {
		miGui=g;
		
	}
	public GUI getGui() {
		return miGui;
	}
	
	public void startJuego() {
		HiloTeclado ht=new HiloTeclado(miGui,jugador);
		ht.start();
		miNivel.run();
	}

}
