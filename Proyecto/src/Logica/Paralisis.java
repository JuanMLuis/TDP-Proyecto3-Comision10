package Logica;

import Estados.EstadoEnemigo;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Estado;

public class Paralisis extends EfectoTemporal{

	public Paralisis() { //timer r000 (esta en milisegundo)
		velocidad = 2; //ponerlo con un random
		posX = enemigo.getCorx();
		posY = enemigo.getCorY();
		miNivel = enemigo.getNivel();

	}

	public void activar(float t) { //t000
		Estado est = enemigo.getEstadoActual();
		Estado parailsis = new EstadoEnemigo(enemigo); 
		timer.start();
		for(int i = 0; i < t; i++) { 
			for(Enemigo e: enemigo.getNivel().getEnemigos())
				e.cambiarEstado(parailsis);
			//for(Entidad e: enemigo.getNivel().getEnemigos())
		}
		
		timer.stop();
		//cambiarle al estado original
	}

}

//por cada enemigo cambio el estado
