package LogicaAbstracta;

import java.util.ArrayList;

public abstract class Enemigo extends Personaje  {


	public Enemigo() { 
		vida = 100;
	}


	public void disparar() {
		estadoActual.disparar(rango);
		resetCooldown();

	}

	public void turno() {
		if(cooldown>0)					//reduccion del cooldown
			cooldown--;
		estadoActual.movimiento('s',velocidad);


	}
	
	protected  void Aceptame(Entidad e) {
		e.aceptarEnemigo(this);
	}
	
	public int getRango() {
		return rango;
	}


	public int getcooldown() {
		return cooldown;
	}
	public abstract void resetCooldown();


	
}
