package Juego;

import java.util.ArrayList;

import Logica.Jugador;
import LogicaAbstracta.Entidad;

public class Nivel1 extends Nivel{
	
	public Nivel1 (Juego j) {
		Mijuego=j;
		Enemigos= new ArrayList<Entidad>();
		jugador=new Jugador();
		
	}

}
