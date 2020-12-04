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

		miJugador.RecibirDaņo(5);
		

	}
	
	public void aceptarPremio(Premio p) {//aun nada
		p.activar();
		p.eliminar(); 
	}
	
	public void aceptarProyectilEnemigo(ProyectilEnemigo p) {
		p.ImpactarPersonaje(miJugador);
	}
	
}
