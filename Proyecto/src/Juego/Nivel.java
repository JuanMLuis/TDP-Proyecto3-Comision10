package Juego;

import Logica.Jugador;
import LogicaAbstracta.Entidad;
import java.util.ArrayList;

public class Nivel {
	
	protected  ArrayList<Entidad> Enemigos;		//use una lista para no tener que coprobar null
	protected Jugador jugador  ;
	
	
	public void remove(Entidad entidad) {
		Enemigos.remove(entidad);
		
	}
	
	public boolean comprobarMovimiento(char d) { 
		return false; //volver a hacer 
	}
	
	

}
