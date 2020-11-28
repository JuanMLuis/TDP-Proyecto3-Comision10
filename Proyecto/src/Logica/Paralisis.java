package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import Estados.EstadoEnemigo;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;

public class Paralisis extends EfectoTemporal{
	
	protected int segundos; 

	public Paralisis() { //timer r000 (esta en milisegundo)
		velocidad = 2; //ponerlo con un random
		posX = enemigo.getCorx();
		posY = enemigo.getCorY();
		miNivel = enemigo.getNivel();
		timer = new Timer(10,acciones);
		segundos = 0;
	}

	public void activar(int t) { //t000
		Estado est = enemigo.getEstadoActual();
		Estado parailsis = new EstadoEnemigo(enemigo); 
		timer.start();
		for(int i = 0; i < t; i++) { 
			for(Personaje e: enemigo.getNivel().getEnemigos()) { //les cambio el estado a paraisis 
				e.cambiarEstado(parailsis);
				i++;
			}
			for(Personaje e: enemigo.getNivel().getEnemigos()) //vuelven a su estado original
				e.cambiarEstado(est);
		}
		
		timer.stop();
		acciones = new ActionListener(){ 
			public void actionPerformed(ActionEvent ae) { 
				segundos = t + 000; 
			}
		};
	}
}

//por cada enemigo cambio el estado
