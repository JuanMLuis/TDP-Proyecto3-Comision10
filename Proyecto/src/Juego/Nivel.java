package Juego;

import Logica.Jugador;
import LogicaAbstracta.Entidad;
import java.util.ArrayList;

public class Nivel {
	
	protected static ArrayList<Entidad> Enemigos;		//use una lista para no tener que coprobar null
	protected Jugador jugador  ;
	
	
	public static void remove(Entidad entidad) {
		Enemigos.remove(entidad);
		
	}
	
	

}
