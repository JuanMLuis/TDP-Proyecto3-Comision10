package Logica;

import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Premio;

public class ObjetoPrecioso extends Premio{
	protected Jugador jugador;
	
	public void turno() {
		
	}
	
	public void pocion() { 
		if(jugador.getVida() == 100)
			jugador.setVida(0);
	}

	

	
	

}
