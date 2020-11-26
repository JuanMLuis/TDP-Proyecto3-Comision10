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


	public void moverse(char s) {//Cambiar a dirreccion para el efecto temporal.
		super.moverse(s);
		Entidad aux =miNivel.Colicion(this); 
		if(aux!=null) {
			aux.aceptarEnemigo(this);
		}
	}
}
