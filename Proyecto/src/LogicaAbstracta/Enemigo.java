package LogicaAbstracta;

public abstract class Enemigo extends Personaje  {


	public Enemigo() { 
		vida = 100;
	}


	public void disparar() {
		estadoActual.disparar(rango);

	}

	public void turno() {
		if(cooldown>=0)					//reduccion del cooldown
			cooldown--;
		estadoActual.movimiento('s',velocidad);

	}
	
	protected  void Aceptame(Entidad e) {
		e.aceptarEnemigo(this);
	}


	
}
