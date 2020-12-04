package VisitorsConcretos;

import Logica.Jugador;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Proyectil;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorEnemigo  extends VisitorAbstracto {
	
	
	public VisitorEnemigo(Personaje ene) {
		miPj=ene;
	}
	
	public void aceptarJugador(Jugador j) {
		//haria algo aca?
	}
	
	public void aceptarSeñalJugador(Jugador j) {
		//if(miPj.getCorY()+miPj.getRango()>=j.getCorY())
			
		//	miPj.disparar();
			
		
	
		
	} 
	public void aceptarProyectil(Proyectil L) {
		L.ImpactarPersonaje(miPj);

	}
		
	

}
