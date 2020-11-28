package VisitorsConcretos;

import Logica.proyectilAliado;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Proyectil;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorProyectil  extends VisitorAbstracto {
	
	protected Proyectil miP;
	
	public VisitorProyectil(proyectilAliado p) {
		miP=p;
	}
	
	public void aceptarEnemigo(Enemigo ene) {

	//	miP.ImpactarPersonaje(ene);
		

	}

}
