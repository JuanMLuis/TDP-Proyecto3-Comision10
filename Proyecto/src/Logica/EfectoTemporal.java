package Logica;

import java.awt.event.ActionListener;

import javax.swing.Timer;

import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Premio;

public abstract class EfectoTemporal extends Premio{ //cada uno de los metodos separarlos en 2 clases distintas
	protected Timer timer;
	protected ActionListener acciones; 
	protected Personaje personaje;

	public EfectoTemporal() { 
		timer = new Timer(10,acciones);
	}

	public void turno() {

	}

	/*public Estado superArmaSanitaria(float r1, float r2) { 
		float empieza;
		float termina;
		Estado arma = new EstadoArmaSanitaria(); 
		if(r1 < r2) { 
			empieza = r1;
			termina = r2;
		}
		else { 
			empieza = r2;
			termina = r1;
		}
		while(empieza < termina) { 
			//poder de desinfeccion del arma
			empieza++;
		}
		return arma;
	}*/


	protected void Aceptame(Personaje e) {
		e.aceptarPremio(this);

	}
}
