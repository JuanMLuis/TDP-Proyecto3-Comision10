package Logica;

import Juego.Nivel;
import LogicaAbstracta.Personaje;

public class Jugador extends Personaje  {
	protected boolean puedeMoverse;
	protected Nivel nivel;
	
	public Jugador() { 
		vida = 0;
	}
	
	public void disparar() {
	
	}

	public void moverse(char d) { 
		if(puedeDesplazarse(d))
			direccionActual = d;
	}
	
	public boolean puedeDesplazarse(char d) { 
		puedeMoverse = false;
		if(nivel.comprobarMovimiento(d))
			puedeMoverse = true; 
		return puedeMoverse;
	}

	
	
}
