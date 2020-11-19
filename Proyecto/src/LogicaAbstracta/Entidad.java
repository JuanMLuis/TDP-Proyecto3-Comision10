package LogicaAbstracta;

import GUI.EntidadGrafica;
import Juego.Nivel;

public abstract class Entidad {

	protected VisitorAbstracto miVisitor;
	protected int Velocidad;
	protected EntidadGrafica miGrafico;
	protected int posX;						//creo que la logica deberia tener su posicion como parametro
	protected int posY;	
	protected Nivel miNivel;
										//protected int tamaño?
	public void Eliminar() {//se elimina a si mismo junto con la parte grafica
		miGrafico.eliminar();
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
	
	public void moverse(char s) {//hacer controles de direccion para actualizar posC y posY
		switch(s) {					//en general si no estamos en el limite, aumento en la direccion, en casos verticales vuelo a origen
		case('a'):
		{
			if(posX>0)				//limite izquierdo es 0, creo
				posX--;
		}break;
		case('s'):
		{
			if(posY<550) {
				posY++;
			}else posY=0;;
		}break;
		case('d'):
		{
			if(posX<780)			//limite derecho es 780(creo)
				posX++;
		}break;
		case('w'):					//no creo que lo usemos nunca, pero para completar con la 4 direcciones posibles lo dejo
		{
			if(posY>0) {
				posY++;
			}else posY=550;
		}break;
		}
		miGrafico.ActualizarPosicion(posX, posY);
		
		//--pedrile al mapa que revise colision
	}
	public abstract void turno();
	
	public abstract void colisionar(Entidad e); //mas que un colicionar generico, habria que hacer uno para cada clace en colision, se usan los visitor para eso
}
