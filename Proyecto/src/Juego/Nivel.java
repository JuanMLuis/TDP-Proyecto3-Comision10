package Juego;

import Logica.Jugador;
import Logica.ProyectilEnemigo;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import java.util.ArrayList;

public abstract class Nivel{
	
	protected  ArrayList<Enemigo> Enemigos;		//use una lista para no tener que coprobar null
	protected  ArrayList<Entidad> Proyectiles;
	protected Jugador jugador  ;//Poner get y mandarlo a Juego y de ahi mandarlo a la GUI
	protected Juego miJuego;
	protected int CantEnemigosVivos;
	protected boolean ganar;
	
	
	public void remove(Entidad entidad) {
		Enemigos.remove(entidad);
		
	}
	
	public boolean comprobarMovimiento(char d) { 
		return false; //volver a hacer 
	}
	
	public Juego getJuego() {
		return miJuego;
	}
	
			//quizas se podria hacer el Nivel como un hilo y no tenerlo como clase aparte, nunca hablamos de esto solo lo dejo como idea
	

	protected void moverEnemigo() {
		
	}
	
	public ArrayList<Entidad> Colicion(Entidad e) {//retorna null si no hay colicion, retona la primera entidad con la que coliciona
		ArrayList<Entidad> colisiones = new ArrayList<Entidad>();
		for(Entidad r: Enemigos) {
			if( r.getHitbox().intersects(e.getHitbox()))
				colisiones.add(r);
		}
		if(jugador.getHitbox().intersects(e.getHitbox()))
			colisiones.add(jugador);
		return colisiones;
	}
	
	protected void ReducirEnemigos() {
		CantEnemigosVivos--;
		if(CantEnemigosVivos==0)
			ganar=true;
	}

	public void setJugador(Jugador jugador2) {
		jugador=jugador2;
		
	}

	public void Turno() {
		for(Entidad e: Enemigos)
			e.turno();

		for(Entidad e: Proyectiles)
			e.turno();
		jugador.turno();
		
	}

	public void addEnemigo(Enemigo e) {
		Enemigos.add(e);
		
	}

	public void addProyectil(Entidad p) {
		Proyectiles.add(p);
		
	}
	
	public void addProyectiles(Entidad p) {
		Proyectiles.add(p);
	}

	public ArrayList<Entidad> mandarSeņal(Entidad e) {
		ArrayList<Entidad> toReturn = new ArrayList<Entidad>();
		for(Entidad r: Enemigos) {
			if(r.getCorx()<=e.getCorx()&&r.getCorx()+10>=e.getCorx()) {
				toReturn.add(r);
			}
		}
		return toReturn;
	}
	
	public ArrayList<Enemigo> getEnemigos() { 
		return Enemigos;
	}
	
	
	
}
	
