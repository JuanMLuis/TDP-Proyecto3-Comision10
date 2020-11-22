package Juego;

import Logica.Jugador;
import LogicaAbstracta.Entidad;
import java.util.ArrayList;

public abstract class Nivel extends Thread{
	
	protected  ArrayList<Entidad> Enemigos;		//use una lista para no tener que coprobar null
	protected Jugador jugador  ;
	protected Juego miJuego;
	protected int CantEnemigosVivos;
	
	
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
	
	public Entidad Colicion(Entidad e) {//retorna null si no hay colicion, retona la primera entidad con la que coliciona
		Entidad toReturn=null;
		boolean encontrado=false;
		int a;
		int b;
		for(Entidad r: Enemigos) {
			a=r.getCorx();
			b=r.getCorY();
			if()
		}
		return toReturn;
	}
	
}
	
