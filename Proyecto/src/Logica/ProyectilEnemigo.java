package Logica;

import LogicaAbstracta.Proyectil;

public class ProyectilEnemigo extends Proyectil {
	
	public void turno(){
		//chequeo de colision
		for(int i=0;i<Velocidad;i++) {
			moverse('s');
			//chequeo de colision
		}
		
	}
}
