package VisitorsConcretos;

import Logica.Jugador;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorEnemigo  extends VisitorAbstracto {
	
	protected Enemigo miEnemigo;
	
	public VisitorEnemigo(Enemigo ene) {
		miEnemigo=ene;
	}
	
	public void aceptarJugador(Jugador j) {
		
	}
	
	public void aceptarSeñalJuegador(Jugador j) {
		if(miEnemigo.getcooldown()==0 && miEnemigo.getCorY()+miEnemigo.getRango()*miEnemigo.getVelocidad()>=j.getCorY())
			
			miEnemigo.disparar();
			
		
		
		
	} 
		
	

}
