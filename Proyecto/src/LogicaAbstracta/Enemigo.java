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
		estadoActual.movimiento('s',Velocidad);
		if(comprobarRango() && cooldown==0)		{		//si esta a rango y tiene el cooldown en 0 dispara
			estadoActual.disparar(rango);
			cooldown=cooldownOriginal;
			estadoActual.movimiento('s', Velocidad);
		}
		
	}
	
	private boolean comprobarRango() {				//revisa si esta a rango de disparo
		return false;
	}
	
}
