package LogicaAbstracta;

import java.awt.Rectangle;
import java.util.ArrayList;

import GUI.EntidadGrafica;
import Juego.Nivel;
import Logica.Jugador;
import Logica.ProyectilEnemigo;

public abstract class Entidad {

	protected int velocidad;
	protected EntidadGrafica miGrafico;
	protected int posX;						//creo que la logica deberia tener su posicion como parametro
	protected int posY;	
	protected Nivel miNivel;
										//protected int tamaño?
	public abstract void eliminar();	//se elimina a si mismo junto con la parte grafica
	
	
	
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
			if(posX<735)			//limite derecho es 780(creo)
				posX++;
		}break;
		case('w'):					//no creo que lo usemos nunca, pero para completar con la 4 direcciones posibles lo dejo
		{
			if(posY>0) {
				posY--;
			}else posY=550;
		}break;
		}
		miGrafico.ActualizarPosicion(posX, posY);
		
		
	}
	public abstract void turno();
	
	public Rectangle getHitbox() {
		return miGrafico.hitbox();
	}
	
	protected abstract void Aceptame(Personaje e); 
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int v) { 
		velocidad = v;
	}
	
	protected void Colicion() {
		ArrayList<Personaje> aux =miNivel.Colision(this); 
		for(Personaje e:aux) {
			Aceptame(e);
		}
	}
}
