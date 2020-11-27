package Logica;

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
		timer.start();
		Estado est = enemigo.getEstadoActual();
		timer.start();
		for(int i = 0; i < t; i++) { 
			for(Entidad e: enemigo.getNivel().getEnemigos())
				
		}
		
		//timer.stop();
		//enemigo.setVelocidad(est);
		//cambiarle al estado original
	}

}

//por cada enemigo cambio el estado
