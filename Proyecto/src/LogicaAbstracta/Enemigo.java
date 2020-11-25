package LogicaAbstracta;

public abstract class Enemigo extends Personaje  {
	
	
	public Enemigo() { 
		vida = 100;
	}
	
	
	public void disparar() {
		// TODO Auto-generated method stub
		
	}
	
	public void turno() {
		if(cooldown>=0)					//reduccion del cooldown
			cooldown--;
		estadoActual.movimiento('s',velocidad);
		if(comprobarRango() && cooldown==0)		{		//si esta a rango y tiene el cooldown en 0 dispara
			estadoActual.disparar(rango);
			cooldown=cooldownOriginal;
		}
		
	}
	
	private boolean comprobarRango() {				//revisa si esta a rango de disparo
		return false;
	}
	
	public void moverse(char s) {
		super.moverse(s);
	
	Entidad aux =miNivel.Colicion(this); 
	if(aux!=null) {
		aux.aceptarEnemigo(this);
		}
	}
}
