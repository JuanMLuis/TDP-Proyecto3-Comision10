package Juego;

import java.util.ArrayList;

import Logica.Jugador;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;
public class Nivel1 extends Nivel{
	
	public Nivel1 (Juego j) {
		miJuego = j;
		Entidades = new ArrayList<Entidad>();
		ganar = false;
		enemigos = new ArrayList<ArrayList<Personaje>>();
		cantOleadas = 2;
		crearOleadas(15); 
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public void rellenarLista() { 
		
	}
}
