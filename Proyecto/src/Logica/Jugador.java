package Logica;

import Estados.EstadoOriginal;
import GUI.EntidadGraficaJugador;
import Juego.Nivel;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;
import VisitorsConcretos.VisitorJugador;

public class Jugador extends Personaje  {
	protected boolean puedeMoverse;
	protected Nivel nivel;
	
	public Jugador(Nivel l) { 
		vida = 0;
		rango=100; //creo que el rango seria solo para enemigos, despues se cambia si todos lo vemos asi
		cooldown=0;
		estadoActual=new EstadoOriginal();
		miVisitor= new VisitorJugador(this);
		posX=385;
		posY=500;
		velocidad=2;
		miNivel=l;
		miGrafico=new EntidadGraficaJugador(posX,posY,this);
	}
	
	public void disparar() {
		
	}

	public void moverse(char d) { 
			direccionActual=d;
	}
	
	
	public void turno() {
		if(cooldown>=0)			
			cooldown--;
		estadoActual.movimiento(direccionActual,velocidad);
		
		
		
		estadoActual.movimiento('+', velocidad);
	}
	
	
	
	public int getVida() { 
		return vida;
	}
	
	public void setVida(int v) { 
		vida = v;
	}
}
