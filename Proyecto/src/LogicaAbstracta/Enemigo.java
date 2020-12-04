package LogicaAbstracta;

import Logica.Jugador;

public abstract class Enemigo extends Personaje  {

	protected int rango;

	public void turno() {
		if(cooldown>0)					//reduccion del cooldown
			cooldown--;
		estadoActual.movimiento('s',velocidad);
		ComprobarRango();
		colision();

	}
	
	protected  void Aceptame(Personaje e) {
		e.aceptarEnemigo(this);
	}
	

	public int getcooldown() {
		return cooldown;
	}
	public abstract void resetCooldown();

	public  void eliminar() {			//cuando tengamos oleadas probablemente lo cambiemos un poco
		miGrafico.eliminar();
		miNivel.removeEnemigo(this);
	}
	
	public void ComprobarRango() {
		Jugador j = miNivel.getJugador();
		if(posX-20<=j.getCorx()&&posX+20>=j.getCorx() && posY+rango>=j.getCorY())
			disparar();
	}
}
