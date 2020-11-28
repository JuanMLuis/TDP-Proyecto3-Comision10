package Juego;

import java.util.ArrayList;

import Logica.EnemigoAlpha;
import Logica.EnemigoBeta;
import Logica.Jugador;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;

public class Nivel1 extends Nivel{
	
	public Nivel1 (Juego j) {
		miJuego=j;
		Enemigos= new ArrayList<Enemigo>();//Recordar de eliminar los jugadores de los siguientes niveles.
		CantEnemigosVivos=20;
		Enemigos.add(new EnemigoAlpha(this, 60, 60));
		Enemigos.add(new EnemigoAlpha(this,150,60));
		Enemigos.add(new EnemigoBeta(this,200,60));
		Enemigos.add(new EnemigoAlpha(this,260,60));
		Enemigos.add(new EnemigoAlpha(this,310,60));
		Enemigos.add(new EnemigoBeta(this, 380, 60));
		Enemigos.add(new EnemigoBeta(this, 460, 60));
		Enemigos.add(new EnemigoAlpha(this, 530, 60));
		Enemigos.add(new EnemigoBeta(this, 670, 60));
		Proyectiles = new ArrayList<Entidad>();
		ganar=false;
	}
	
	
	

	public Jugador getJugador() {
		return jugador;
	}
	

}
