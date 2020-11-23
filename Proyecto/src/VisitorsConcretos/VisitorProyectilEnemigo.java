package VisitorsConcretos;

import Logica.Jugador;
import Logica.ProyectilEnemigo;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorProyectilEnemigo  extends VisitorAbstracto {

	public VisitorProyectilEnemigo(ProyectilEnemigo e) {
		miEntidad=e;
	}
	
	public void aceptarJugador(Jugador j) {
		
	}
}
