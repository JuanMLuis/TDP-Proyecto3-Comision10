package Juego;

import Logica.Jugador;
import Logica.ProyectilEnemigo;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Proyectil;

import java.util.ArrayList;

public abstract class Nivel{
	
	protected  ArrayList<Personaje> Oleada1;		//use una lista para no tener que coprobar null
	protected  ArrayList<Personaje> Enemigos;		//mi idea es que Enemigos haga referencia a la oleada que esta actualmente en uso o tener un metodo que cargue oleadas
	protected  ArrayList<Entidad> Entidades;		//dira de poner aca a todas las entidades menos Enemigos y al jugador
	protected Jugador jugador  ;//Poner get y mandarlo a Juego y de ahi mandarlo a la GUI
	protected Juego miJuego;
	protected int CantEnemigosVivos;
	protected boolean ganar;
	
	
	public void removeEnemigo(Entidad entidad) {
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
	
	public ArrayList<Personaje> Colicion(Entidad e) {//retorna null si no hay colicion, retona la primera entidad con la que coliciona
		ArrayList<Personaje> colisiones = new ArrayList<Personaje>();
		if(jugador!=e && jugador.getHitbox().intersects(e.getHitbox()))
			colisiones.add(jugador);
		for(Personaje r: Enemigos) {
			if(e!=r &&  r.getHitbox().intersects(e.getHitbox()))
				colisiones.add(r);
		}
		
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

	public  void  Turno() {
		 ArrayList<Entidad> aux= new ArrayList<Entidad>();	
		for(Entidad e:Enemigos)								//este paso extra evita un error que se producia
			aux.add(e);
		for(Entidad r: Entidades)
			aux.add(r);
		MoverEntidades(aux);
		jugador.turno();
		
	}

	public void addEnemigo(Enemigo e) {
		Enemigos.add(e);
		
	}

	public void addEntidad(Entidad p) {
		Entidades.add(p);
		
	}

	public ArrayList<Personaje> mandarSeñal(Entidad e) {
		ArrayList<Personaje> toReturn = new ArrayList<Personaje>();
		for(Personaje r: Enemigos) {
			if(r.getCorx()<=e.getCorx()&&r.getCorx()+10>=e.getCorx()) {
				toReturn.add(r);
			}
		}
		return toReturn;
	}
	
	public ArrayList<Personaje> getEnemigos() { 
		return Enemigos;
	}

	public void removeEntidad(Entidad e) {
		Entidades.remove(e);
		
	}
	
	protected void MoverEntidades(ArrayList<Entidad> list) {
		for(Entidad e: list )
			e.turno();
	}

	public void reset() {
		 ArrayList<Entidad> aux= new ArrayList<Entidad>();
		for(Entidad e:Oleada1)
			aux.add(e);
		for(Entidad e:Entidades)
			aux.add(e);
		
		for(Entidad e:aux)
			e.eliminar();
		
	}
	
	
	
	
}
	
