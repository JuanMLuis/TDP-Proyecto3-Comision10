package Logica;

import GUI.EntidadGraficaProyectilEnemigo;
import Juego.Nivel;
import LogicaAbstracta.Proyectil;
import VisitorsConcretos.VisitorProyectilEnemigo;

public class ProyectilEnemigo extends Proyectil {
	
	public ProyectilEnemigo(int x,int y,Nivel p,int r){//demaciados parametros quizas?
		da�o=15;
		velocidad=14;					//de lo posible la velocidad deve ser mayor que la del que disparo
		miNivel=p;
		posX=x;
		posY=y;
		miGrafico= new EntidadGraficaProyectilEnemigo(x,y,this);
		miVisitor=new VisitorProyectilEnemigo(this);
	}
	
	
	
	
	
	
	public void turno(){
<<<<<<< Updated upstream
		//chequeo de colision
		for(int i=0;i<velocidad;i++) {
=======
		for(int i=0;i<Velocidad;i++) {
>>>>>>> Stashed changes
			moverse('s');
			rango--;
		}
		if(rango<=0)
			Eliminar();
		
	}
}
