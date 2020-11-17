package VisitorsConcretos;

import LogicaAbstracta.Enemigo;
import LogicaAbstracta.VisitorAbstracto;

public class VisitorEnemigo  extends VisitorAbstracto {
	
	public VisitorEnemigo(Enemigo ene) {
		miEntidad=ene;
	}

}
