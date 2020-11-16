package LogicaAbstracta;

import GUI.EntidadGrafica;
import Juego.Juego;

public abstract class Entidad {

	protected VisitorAbstracto MiVisitor;
	protected int Velocidad;
	protected EntidadGrafica MiGrafico;
	protected int posX;						//creo que la logica deberia tener su posicion como parametro
	protected int posY;	
	
	public void Eliminar() {//se elimina a si mismo junto con la parte grafica
		MiGrafico.eliminar();
		Juego.eliminar(this);
	}
}
