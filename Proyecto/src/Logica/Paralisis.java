package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask; 
import Estados.EstadoEnemigo;
import Estados.EstadoParalisis;
import GUI.EntidadGraficaParalisis;
import Juego.Nivel;
import LogicaAbstracta.EfectoTemporal;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;

public class Paralisis extends EfectoTemporal{

	protected int segundos; 

	public Paralisis(int corX, int corY, Nivel n) {
		velocidad = 4; //ponerlo con un random
		posX =corX;
		posY = corY;
		miNivel = n;
		timer = new Timer();
		segundos = 0;
		miGrafico = new EntidadGraficaParalisis(corX, corY, this); 
		miNivel.addEntidad(this);
	}

	public void activar() { 
		Estado parailsis; 
			for(Personaje p: miNivel.getEnemigos()) {
				parailsis = new EstadoParalisis(p); //les cambio el estado a paraisis 
				p.cambiarEstado(parailsis);
			}
			timer.schedule(new EliminarParalisis(), 5000);
		}
	
	private class EliminarParalisis extends TimerTask{

		public void run() {
			Estado estadoAct; 
			for(Personaje p: miNivel.getEnemigos()) { //saco la paralisis
				estadoAct = new EstadoEnemigo(p); //les cambio el estado a paraisis 
				p.cambiarEstado(estadoAct);
			}
		} 
	}
}
