package VisitorsConcretos;

import Logica.Jugador;
import Logica.ProyectilEnemigo;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Premio;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorJugador extends VisitorAbstracto {
	
	public VisitorJugador(Jugador j) {
		miEntidad=j;
	}
	
	public void aceptarEnemigo(Enemigo ene) {
		ene.disparar();
	}
	public void aceptarPremio(Premio p) {
		
	}
	
	public void aceptarProyectilEnemigo(ProyectilEnemigo p) {
		
	}
	
}
