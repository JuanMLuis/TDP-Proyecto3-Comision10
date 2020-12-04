package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import Estados.EstadoEnemigo;
import LogicaAbstracta.EfectoTemporal;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;

public class Paralisis extends EfectoTemporal{

	protected int segundos; 

	public Paralisis() {
		velocidad = 2; //ponerlo con un random
		posX = personaje.getCorx();
		posY = personaje.getCorY();
		miNivel = personaje.getNivel();
		timer = new Timer(10,acciones);
		segundos = 0;
	}

	public void activar(int t) { 
		Estado est = personaje.getEstadoActual();
		Estado parailsis = new EstadoEnemigo(personaje); 
		timer.start();
		for(int i = 0; i < t; i++) { 
			for(Personaje p: personaje.getNivel().getEnemigos()) { //les cambio el estado a paraisis 
				p.cambiarEstado(parailsis);
				i++;
			}
			for(Personaje p: personaje.getNivel().getEnemigos()) //vuelven a su estado original
				p.cambiarEstado(est);
		}

		timer.stop();
		acciones = new ActionListener(){ 
			public void actionPerformed(ActionEvent ae) { 
				segundos = t + 000; 
			}
		};
	}

	protected void Aceptame(Personaje e) {
		
	}
}
