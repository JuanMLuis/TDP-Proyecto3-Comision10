package LogicaAbstracta;

public abstract class Estado { //estado de los premios y personajes
	protected Personaje miEntidad;

	public abstract void disparar();//recibe el rango

	public void movimiento(char c, int v) {
		for(int i=0;i<=v;i++) {
			miEntidad.moverse(c);
		}
	}


}
