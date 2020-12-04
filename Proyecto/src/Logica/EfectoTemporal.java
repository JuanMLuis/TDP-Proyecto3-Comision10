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

	
	public void turno() {
		
	}
}
