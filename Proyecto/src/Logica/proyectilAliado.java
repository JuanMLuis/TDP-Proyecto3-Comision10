package Logica;

import GUI.EntidadGraficaProyectilAliado;
import Juego.Nivel;
import LogicaAbstracta.Proyectil;
import VisitorsConcretos.VisitorProyectil;

public class proyectilAliado extends Proyectil {
	
		public proyectilAliado(int x,int y,Nivel p) {
			daño=20;
			velocidad=14;					//de lo posible la velocidad deve ser mayor que la del que disparo
			miNivel=p;
			posX=x;
			posY=y;
			miGrafico= new EntidadGraficaProyectilAliado(x,y,this);
			miVisitor=new VisitorProyectil(this);
			miNivel=p;
			miNivel.addEntidad(this);
		}
	
		public void turno() {
			for(int i=0;i<velocidad;i++) {
				moverse('w');
			}
		}
	

}
