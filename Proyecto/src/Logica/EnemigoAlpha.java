package Logica;

import Estados.EstadoEnemigo;
import GUI.EntidadGraficaEnemigoAlpha;
import Juego.Nivel;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import VisitorsConcretos.VisitorEnemigo;

public class EnemigoAlpha extends Enemigo {
	
	
	public EnemigoAlpha(Nivel n,int x,int y) {
		posX=x;
		posY=y;
		miNivel=n;
		Velocidad=3;
		miGrafico=new EntidadGraficaEnemigoAlpha(x,y,this);
		miVisitor=new VisitorEnemigo(this);
		estadoActual= new EstadoEnemigo(this);
	}

	
	


}
