package VisitorsConcretos;

import Logica.Jugador;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorEnemigo  extends VisitorAbstracto {
	
	public VisitorEnemigo(Enemigo ene) {
		miEntidad=ene;
	}
	
	public void aceptarJugador(Jugador j) {
		j.disparar();
	}

}
