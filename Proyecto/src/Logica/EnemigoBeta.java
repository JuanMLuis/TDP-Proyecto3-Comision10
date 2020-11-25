package Logica;

import Estados.EstadoEnemigo;
import GUI.EntidadGraficaEnemigoAlpha;
import Juego.Nivel;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import VisitorsConcretos.VisitorEnemigo;

public class EnemigoBeta extends Enemigo {

	public EnemigoBeta(Nivel n,int x,int y) {//LR: Modificar en base a EB
		posX=x;
		posY=y;
		miNivel=n;
		velocidad=5;
		miGrafico=new EntidadGraficaEnemigoAlpha(x,y,this);
		miVisitor=new VisitorEnemigo(this);
		estadoActual= new EstadoEnemigo(this);
	}

	public void colisionar(Entidad e) {
		// TODO Auto-generated method stub
		
	}

}
