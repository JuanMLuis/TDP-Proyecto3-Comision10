package LogicaAbstracta;

import Logica.Jugador;

public abstract class ObjetoPrecioso extends Premio{
	protected Jugador jugador;
	
	public void turno() {
		
	}

	protected void Aceptame(Entidad e) {
	e.aceptarPremio(this);
	}

}
