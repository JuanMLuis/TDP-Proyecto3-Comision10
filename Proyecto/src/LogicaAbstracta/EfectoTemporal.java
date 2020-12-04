package LogicaAbstracta;

import java.awt.event.ActionListener;

import javax.swing.Timer;

public abstract class EfectoTemporal extends Premio{ //cada uno de los metodos separarlos en 2 clases distintas
	protected Timer timer;
	protected ActionListener acciones; 
	protected Personaje personaje;

	public EfectoTemporal() { 
		timer = new Timer(10,acciones);
	}

	public void turno() {

	}

	protected void Aceptame(Entidad e) {
		e.aceptarPremio(this);

	}
}
