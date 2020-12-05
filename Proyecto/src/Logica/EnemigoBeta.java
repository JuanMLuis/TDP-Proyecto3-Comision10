package Logica;

import Estados.EstadoEnemigoAlpha;
import Estados.EstadoEnemigoBeta;
import GUI.EntidadGraficaEnemigoAlpha;
import GUI.EntidadGraficaEnemigoBeta;
import Juego.Nivel;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import VisitorsConcretos.VisitorEnemigo;

public class EnemigoBeta extends Enemigo {

	public EnemigoBeta(Nivel n,int x,int y) {//tienen mas vida( se cumple)
		posX=x;
		posY=y;
		miNivel=n;
		velocidad=2;
		miGrafico=new EntidadGraficaEnemigoBeta(x,y,this);
		miVisitor=new VisitorEnemigo(this);
		estadoActual= new EstadoEnemigoBeta(this);
		rango=600;
		cooldown=0;
		vida=175;
	}

	@Override
	public void resetCooldown() {
		cooldown=40;
		
	}

	
	public void resetEstado() {
		estadoActual=new EstadoEnemigoBeta(this);
	}

	

}
