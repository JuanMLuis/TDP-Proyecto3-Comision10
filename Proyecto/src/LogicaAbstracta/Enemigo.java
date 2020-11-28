package LogicaAbstracta;

public abstract class Enemigo extends Personaje  {


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

	public  void eliminar() {			//cuando tengamos oleadas probablemente lo cambiemos un poco
		miGrafico.eliminar();
		miNivel.removeEnemigo(this);
	}
	
}
