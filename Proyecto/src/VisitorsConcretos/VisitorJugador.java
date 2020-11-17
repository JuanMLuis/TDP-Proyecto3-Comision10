package VisitorsConcretos;

import Logica.Jugador;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorJugador extends VisitorAbstracto {
	
	public VisitorJugador(Jugador j) {
		miEntidad=j;
	}
	
}
