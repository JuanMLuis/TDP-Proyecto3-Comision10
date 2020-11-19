package LogicaAbstracta;

public abstract class Personaje extends Entidad  {
	
	protected int vida;
	protected int rango;
	protected int cooldown;
	protected int cooldownOriginal;   // guardamos el valor orginal para los reset del cooldown
	protected Estado estadoActual;
	protected char direccionActual;
	
	
	
	public abstract void disparar();
	
	public  void cambiarEstado(Estado est) {
		estadoActual=est;
	}
	
	public void RecibirDaño(int dmg) {
		vida=vida-dmg;
	}
}
