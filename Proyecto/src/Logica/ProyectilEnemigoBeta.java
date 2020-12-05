package Logica;

import GUI.EntidadGraficaProyectilEnemigo;
import Juego.Nivel;
import LogicaAbstracta.ProyectilEnemigo;

public class ProyectilEnemigoBeta extends ProyectilEnemigo {
	
	public ProyectilEnemigoBeta(int x,int y,Nivel p){//demaciados parametros quizas?
		daño=10;
		velocidad=14;					//de lo posible la velocidad deve ser mayor que la del que disparo
		miNivel=p;
		posX=x;
		posY=y;
		miGrafico= new EntidadGraficaProyectilEnemigo(x,y,this);
		miNivel=p;
		miNivel.addEntidad(this);

	}
}
