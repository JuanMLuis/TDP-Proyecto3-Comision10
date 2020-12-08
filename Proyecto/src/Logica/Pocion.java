package Logica;

import GUI.EntidadGraficaPocion;
import Juego.Nivel;
import LogicaAbstracta.ObjetoPrecioso;

public class Pocion extends ObjetoPrecioso{


	public Pocion(int corX, int corY, Nivel n) {
		velocidad = 4; 
		posX =corX;
		posY = corY;
		miNivel = n;
		miGrafico = new EntidadGraficaPocion(corX, corY, this); 
		miNivel.addEntidad(this);
	}
	@Override
	public void activar() {
		int vida=miNivel.getJugador().getVida();
		if(vida>50)
			vida=100;
		else
			vida=vida+50;
		miNivel.getJugador().setVida(vida);
	}

}
