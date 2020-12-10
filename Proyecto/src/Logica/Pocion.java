package Logica;

import GUI.EntidadGraficaPocion;
import Juego.Nivel;
import LogicaAbstracta.Premio;

public class Pocion extends Premio{


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
		miNivel.getJugador().setVida(100);
	}

}
