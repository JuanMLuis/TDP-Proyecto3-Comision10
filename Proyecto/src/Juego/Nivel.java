package Juego;

import Logica.Jugador;
import LogicaAbstracta.Entidad;
import java.util.ArrayList;

public abstract class Nivel {
	
	protected  ArrayList<Entidad> Enemigos;		//use una lista para no tener que coprobar null
	protected Jugador jugador  ;
	protected Juego miJuego;
	
	
	public void remove(Entidad entidad) {
		Enemigos.remove(entidad);
		
	}
	
	public boolean comprobarMovimiento(char d) { 
		return false; //volver a hacer 
	}
	
	public Juego getJuego() {
		return miJuego;
	}
}
