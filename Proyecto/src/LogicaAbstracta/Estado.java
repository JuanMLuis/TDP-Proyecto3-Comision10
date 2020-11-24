package LogicaAbstracta;

public abstract class Estado { //estado de los premios y personajes
	protected Personaje miEntidad;
	
	public abstract void disparar(int r);//recive el rango
	
	public abstract void movimiento(char c,int v);//direccion y velocidad

	public abstract void recibirDaño(int dmg);
}
