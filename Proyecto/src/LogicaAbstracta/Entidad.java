package LogicaAbstracta;

import java.awt.Rectangle;
import java.util.ArrayList;

import GUI.EntidadGrafica;
import Juego.Nivel;
import Logica.Jugador;
import Logica.ProyectilEnemigo;

public abstract class Entidad {

	protected VisitorAbstracto miVisitor;
	protected int velocidad;
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
			if(posX<735)			//limite derecho es 780(creo)
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
		ArrayList<Entidad> aux =miNivel.Colicion(this); 
		for(Entidad e:aux) {
			e.Aceptame(this);
		}
		//--pedrile al mapa que revise colision
	}
	public abstract void turno();
	
	public void aceptarEnemigo(Enemigo e) {
		miVisitor.aceptarEnemigo(e);
	}
	public void aceptarJugador(Jugador j) {
		miVisitor.aceptarJugador(j);
	}
	public void aceptarPremio(Premio p) {
		miVisitor.aceptarPremio(p);
	}
	public void AceptarProyectil(Proyectil p) {
		miVisitor.aceptarProyectil(p);
	}
	public void AceptarProyectilEnemigo(ProyectilEnemigo p) {
		miVisitor.aceptarProyectilEnemigo(p);
	}
	
	public void aceptarSeñalJugador(Jugador j) {
		miVisitor.aceptarSeñalJuegador(j);
	}
	public Rectangle getHitbox() {
		return miGrafico.hitbox();
	}
	
	protected abstract void Aceptame(Entidad e); 
		
	

	
}
