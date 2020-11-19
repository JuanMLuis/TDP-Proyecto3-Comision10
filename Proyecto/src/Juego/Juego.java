package Juego;

import GUI.GUI;
import LogicaAbstracta.Entidad;

public class Juego {
	protected GUI miGui;
	protected Nivel miNivel;
	
	
	public Juego(GUI g) {
		miGui=g;
		miNivel=new Nivel1(this);
	}
	
	
	public void setGUI(GUI g) {
		miGui=g;
		
	}
	public GUI getGui() {
		return miGui;
	}
	
	public void startJuego() {
		miNivel.run();
	}

}
