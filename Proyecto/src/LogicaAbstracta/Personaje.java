package LogicaAbstracta;

public abstract class Personaje extends Entidad  {
	
	protected int vida;
	protected int rango;
	protected int cooldown;
	protected Estado EstadoActual;
	protected char direccionActual;
	
	
	public abstract void disparar();
	
	public  void cambiarEstado(Estado est) {
		EstadoActual=est;
	}
	
public void RecivirDaño(int dmg) {
		vida=vida-dmg;
	}
}
