package VisitorsConcretos;

import Logica.Jugador;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorJugador extends VisitorAbstracto {
	
	public VisitorJugador(Jugador j) {
		miEntidad=j;
	}
	
	public void aceptarEnemigo(Enemigo ene) {
		ene.disparar();
	}
	
}
