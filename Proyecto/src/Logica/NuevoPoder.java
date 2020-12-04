package Logica;

import javax.swing.Timer;

import Estados.EstadoAuxiliar;
import LogicaAbstracta.EfectoTemporal;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Proyectil;

public class NuevoPoder extends EfectoTemporal{

	public NuevoPoder() { 
		velocidad = 2; //ponerlo con un random
		posX = personaje.getCorx();
		posY = personaje.getCorY();
		miNivel = personaje.getNivel();
		timer = new Timer(10,acciones);
	}

	public void activar(int t) { 
		Estado nuevo = new EstadoAuxiliar(personaje); 
		//de que tipo deria un arma?? Se que lo pregunte mil veces pero no me acuerdo jajaja
		timer.start(); 
		Proyectil armaNueva = new proyectilAliado(posX, posY, miNivel);
		for(int i = 0; i < t; i++) { 
			for(Personaje p: personaje.getNivel().getEnemigos()) {
				
			}
		}
	}

	protected void Aceptame(Personaje e) {
		
	}
}
