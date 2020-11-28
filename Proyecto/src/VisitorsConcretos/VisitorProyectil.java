package VisitorsConcretos;

import Logica.proyectilAliado;
import LogicaAbstracta.Proyectil;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorProyectil  extends VisitorAbstracto {
	
	protected Proyectil miP;
	
	public VisitorProyectil(proyectilAliado p) {
		miP=p;
	}

}
