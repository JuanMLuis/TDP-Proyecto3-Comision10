package Logica;

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
		for(int i = 0; i < t; i++) { 
			//for(Enemigo e: )
				e.cambiarEstado(enemigo.); 
		}
		timer.stop();
		//cambiarle al estado original
	}

}

//por cada enemigo cambio el estado
