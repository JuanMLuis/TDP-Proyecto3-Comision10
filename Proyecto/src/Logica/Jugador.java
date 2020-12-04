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
	protected void Aceptame(Personaje e) {
		e.aceptarJugador(this);
		
	}
	
	public void mandarSeņal() {
		ArrayList<Personaje> aux=miNivel.mandarSeņal(this);
		for(Personaje e: aux) {
			e.aceptarSeņalJugador(this);
		}
	}
	
	public void moverse(char s) {
		
		super.moverse(s);
		Colicion();
		mandarSeņal();

	}
	
	public void RecibirDaņo(int dmg) {
		if(invencibilidad==0) {
			super.RecibirDaņo(dmg);
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

