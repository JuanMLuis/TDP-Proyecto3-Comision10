package Logica;

import java.util.ArrayList;

import Estados.EstadoOriginal;
import GUI.EntidadGraficaJugador;
import Juego.Nivel;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;
import VisitorsConcretos.VisitorJugador;

public class Jugador extends Personaje  {
	protected boolean puedeMoverse;
	protected int invencibilidad;
	
	public Jugador(Nivel l) { 
		vida = 100;
		rango=100; //creo que el rango seria solo para enemigos, despues se cambia si todos lo vemos asi
		cooldown=0;
		estadoActual=new EstadoOriginal(this);
		miVisitor= new VisitorJugador(this);
		posX=385;
		posY=430;
		velocidad=15;
		miNivel=l;
		miGrafico=new EntidadGraficaJugador(posX,posY,this);
		invencibilidad=0;
		miNivel.getJuego().getGui().actualizarVida(0);
	}
	

	public void setDireccion(char d) { 
		direccionActual=d;
	}
	
	
	public void turno() {
		if(invencibilidad>0)
			invencibilidad--;
		if(cooldown>0)			
			cooldown--;
		
		estadoActual.movimiento(direccionActual,velocidad);
		
		direccionActual=('+');
	
	}
	
	
	
	public int getVida() { 
		return vida;
	}
	
	public void setVida(int v) { 
		vida = v;
	}

	@Override
	protected void Aceptame(Entidad e) {
		e.aceptarJugador(this);
		
	}
	
	public void mandarSeñal() {
		ArrayList<Entidad> aux=miNivel.mandarSeñal(this);
		for(Entidad e: aux) {
			e.aceptarSeñalJugador(this);
		}
	}
	
	public void moverse(char s) {
		
		super.moverse(s);
		
		mandarSeñal();

	}
	
	public void RecibirDaño(int dmg) {
		if(invencibilidad==0) {
			super.RecibirDaño(dmg);
			invencibilidad=30;				//30 ciclos, son 3 segundos 
			miNivel.getJuego().getGui().actualizarVida(100-vida);
		}
	}
	
public  void eliminar() {
		miGrafico.eliminar();
		miNivel.getJuego().gameOver();
	}



	protected void resetCooldown() {
		cooldown=5;
		
	}
	
}

