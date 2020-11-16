package Juego;

import GUI.GUI;
import LogicaAbstracta.Entidad;

public class Juego {
	protected GUI miGui;
	protected Nivel miNivel;
	
	
	
	
	
	
	public GUI getGui() {
		return miGui;
	}






	public static void eliminar(Entidad entidad) {
		Nivel.remove(entidad);
		
	}
}
