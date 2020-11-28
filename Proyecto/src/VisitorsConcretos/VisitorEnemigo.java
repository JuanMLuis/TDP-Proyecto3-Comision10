package VisitorsConcretos;

import Logica.Jugador;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Proyectil;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorEnemigo  extends VisitorAbstracto {
	
	protected Enemigo miEnemigo;
	
	public VisitorEnemigo(Enemigo ene) {
		miEnemigo=ene;
	}
	
	public void aceptarJugador(Jugador j) {
		//haria algo aca?
	}
	
	public void aceptarSeñalJuegador(Jugador j) {
		if(miEnemigo.getCorY()+miEnemigo.getRango()*miEnemigo.getVelocidad()>=j.getCorY())
			
			miEnemigo.disparar();
			
		
	
		
	} 
	public void aceptarProyectil(Proyectil L) {
		L.ImpactarPersonaje(miEnemigo);

	}
		
	

}
