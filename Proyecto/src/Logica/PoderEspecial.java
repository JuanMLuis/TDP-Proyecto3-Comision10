package Logica;

import LogicaAbstracta.ObjetoPrecioso;
import LogicaAbstracta.Personaje;

public class PoderEspecial extends ObjetoPrecioso{
	
	
	public void pocion() { 
		if(jugador.getVida() == 100)
			jugador.setVida(0);
	}

	@Override
	public void activar() {
		// TODO Auto-generated method stub
		
	}

	
	
}
