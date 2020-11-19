package LogicaAbstracta;

import GUI.EntidadGrafica;

public abstract class Estado { //estado de los premios y personajes
	protected Entidad miEntidad;
	
	public abstract void disparar(int r);//recive el rango
	
	public abstract void movimiento(char c,int v);//direccion y velocidad

}
