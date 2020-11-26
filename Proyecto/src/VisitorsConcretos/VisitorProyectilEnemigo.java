package VisitorsConcretos;

import Logica.Jugador;
import Logica.ProyectilEnemigo;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorProyectilEnemigo  extends VisitorAbstracto {

	protected ProyectilEnemigo MiProyectilEnemigo;
	public VisitorProyectilEnemigo(ProyectilEnemigo e) {
		MiProyectilEnemigo=e;
	}
	public void aceptarJugador(Jugador j) {
		
	}
}
