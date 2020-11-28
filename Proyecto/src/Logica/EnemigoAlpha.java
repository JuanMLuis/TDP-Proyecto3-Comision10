package Logica;

import Estados.EstadoEnemigo;
import GUI.EntidadGraficaEnemigoAlpha;
import Juego.Nivel;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import VisitorsConcretos.VisitorEnemigo;

public class EnemigoAlpha extends Enemigo {
	
	
	public EnemigoAlpha(Nivel n,int x,int y) {//Cuando llega al 20% de la vida duplica su velocidad de movimiento
		posX=x;  //tienen memos vida pero hacen mas daño
		posY=y;
		miNivel=n;
		velocidad=2;
		miGrafico=new EntidadGraficaEnemigoAlpha(x,y,this);
		miVisitor=new VisitorEnemigo(this);
		estadoActual= new EstadoEnemigo(this);
		rango=100;
		cooldown=0;
		vida=60;
	}

	@Override
	public void resetCooldown() {
		cooldown=50;
		
	}

	
	


}
