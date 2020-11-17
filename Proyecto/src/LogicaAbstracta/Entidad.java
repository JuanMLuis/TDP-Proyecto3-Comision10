package LogicaAbstracta;

import GUI.EntidadGrafica;
import Juego.Juego;
import Juego.Nivel;

public abstract class Entidad {

	protected VisitorAbstracto MiVisitor;
	protected int Velocidad;
	protected EntidadGrafica MiGrafico;
	protected int posX;						//creo que la logica deberia tener su posicion como parametro
	protected int posY;	
	protected Nivel miNivel;
										//protected int tamaño?
	public void Eliminar() {//se elimina a si mismo junto con la parte grafica
		MiGrafico.eliminar();
		miNivel.remove(this);
		
	}
	public Nivel getNivel() {
		return miNivel;
	}
	
	public int getCorx() {
		return posX;
	}
	public int getCorY() {
		return posY;
	}
}
