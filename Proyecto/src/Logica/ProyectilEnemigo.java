package Logica;

import GUI.EntidadGraficaProyectilEnemigo;
import Juego.Nivel;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Proyectil;


public class ProyectilEnemigo extends Proyectil {
	
	public ProyectilEnemigo(int x,int y,Nivel p){//demaciados parametros quizas?
		daño=15;
		velocidad=14;					//de lo posible la velocidad deve ser mayor que la del que disparo
		miNivel=p;
		posX=x;
		posY=y;
		miGrafico= new EntidadGraficaProyectilEnemigo(x,y,this);
		miNivel=p;
		miNivel.addEntidad(this);

	}
	
	
	protected void Aceptame(Personaje e) {
		e.AceptarProyectilEnemigo(this);
	}
	
	
	
	public void turno(){

		//chequeo de colision
		for(int i=0;i<velocidad;i++) {
			moverse('s');
		}
		
		Colicion();

		
	}
}
