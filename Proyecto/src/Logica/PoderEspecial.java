package Logica;

import LogicaAbstracta.ObjetoPrecioso;

public class PoderEspecial extends ObjetoPrecioso{
	
	
	public void pocion() { 
		if(jugador.getVida() == 100)
			jugador.setVida(0);
	}
}