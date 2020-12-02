package LogicaAbstracta;

public abstract class Enemigo extends Personaje  {


	public void turno() {
		if(cooldown>0)					//reduccion del cooldown
			cooldown--;
		estadoActual.movimiento('s',velocidad);
		Colicion();

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
	
}
