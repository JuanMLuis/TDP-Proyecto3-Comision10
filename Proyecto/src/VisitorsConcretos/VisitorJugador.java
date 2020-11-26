package VisitorsConcretos;

import Logica.Jugador;
import Logica.ProyectilEnemigo;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Premio;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorJugador extends VisitorAbstracto {
	protected Jugador miJugador;

	public VisitorJugador(Jugador j) {
		miJugador=j;
	}
	
	public void aceptarEnemigo(Enemigo ene) {

		miJugador.RecibirDaño(5);
		

	}
	
	public void aceptarPremio(Premio p) {
		
	}
	
	public void aceptarProyectilEnemigo(ProyectilEnemigo p) {
		
	}
	
}
