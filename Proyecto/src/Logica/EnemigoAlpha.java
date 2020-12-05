package Logica;

import Estados.EstadoEnemigoAlpha;
import GUI.EntidadGraficaEnemigoAlpha;
import Juego.Nivel;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import VisitorsConcretos.VisitorEnemigo;

public class EnemigoAlpha extends Enemigo {
	
	protected int vidaMaxima;
	
	public EnemigoAlpha(Nivel n,int x,int y) {//Cuando llega al 20% de la vida duplica su velocidad de movimiento
		posX=x;  //tienen menos vida pero hacen mas da�o
		posY=y;
		miNivel=n;
		velocidad=3;
		miGrafico=new EntidadGraficaEnemigoAlpha(x,y,this);
		miVisitor=new VisitorEnemigo(this);
		estadoActual= new EstadoEnemigoAlpha(this);
		rango=200;
		cooldown=0;
		vida=125;
		vidaMaxima=vida;
	}

	@Override
	public void resetCooldown() {
		cooldown=50;
		
	}
	public void RecibirDa�o(int dmg) {
		super.RecibirDa�o(dmg);
		if(vida<=((vidaMaxima*20)/100)) {//20% de la vida para la velocidad.
			velocidad=velocidad*2;
			System.out.println("Hols");
		}
	}
	
	


}
