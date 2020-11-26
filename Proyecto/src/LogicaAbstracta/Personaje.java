package LogicaAbstracta;

public abstract class Personaje extends Entidad  {
	
	protected int vida;
	protected int rango;
	protected int cooldown;
	protected int cooldownOriginal;   // guardamos el valor orginal para los reset del cooldown
	protected Estado estadoActual;
	protected char direccionActual;
	protected int dmg; 					//los personajes disparan y mandan su da�o a los proyectiles
	
	
	
	public abstract void disparar();
	
	public  void cambiarEstado(Estado est) {
		estadoActual=est;
	}
	
	public void RecibirDa�o(int dmg) {
		estadoActual.recibirDa�o(dmg);
	}
	
	public void setVida(int v) {
		vida=v;
	}
	
	public int getVida() {
		return vida;
	}
	
	public Estado getEstadoActual() { 
		return estadoActual;
	}
	
}
