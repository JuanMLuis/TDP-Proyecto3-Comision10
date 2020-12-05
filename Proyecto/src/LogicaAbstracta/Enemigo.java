package LogicaAbstracta;

import Logica.Jugador;
import Logica.NuevoPoder;
import Logica.Paralisis;
import Logica.Pocion;

public abstract class Enemigo extends Personaje  {

	protected int rango;

	public void turno() {
		if(cooldown>0)					//Reduccion del cooldown.
			cooldown--;
		estadoActual.movimiento('s',velocidad);
		ComprobarRango();
		colision();

	}
	
	protected  void aceptame(Personaje e) {
		e.aceptarEnemigo(this);
	}
	

	public int getcooldown() {
		return cooldown;
	}
	public abstract void resetCooldown();

	public  void eliminar() {	
		miGrafico.eliminar();
		miNivel.removeEnemigo(this);
		int random=(int) (Math.random()*10+1);
		switch(random) {
		case 1:
			new Paralisis(posX, posY, miNivel); 
			break;
		case 2:
			new NuevoPoder(posX, posY, miNivel);
			break;
		case 3:
			new Pocion(posX,posY,miNivel);
			break;
		}
		
	}
	
	public void ComprobarRango() {
		Jugador j = miNivel.getJugador();
		if(posX-20<=j.getCorx()&&posX+20>=j.getCorx() && posY+rango>=j.getCorY())
			disparar();
	}
	
	
}
