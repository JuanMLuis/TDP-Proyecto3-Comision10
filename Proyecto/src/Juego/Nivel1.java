package Juego;

import java.util.ArrayList;

import Logica.EnemigoAlpha;
import Logica.Jugador;
import LogicaAbstracta.Entidad;

public class Nivel1 extends Nivel{
	
	public Nivel1 (Juego j) {
		miJuego=j;
		Enemigos= new ArrayList<Entidad>();
		jugador=new Jugador(this);
		CantEnemigosVivos=20;
		Enemigos.add(new EnemigoAlpha(this, 60, 60));
		ganar=false;
	}
	
	
	public void  run() {//basicamente el movimiento de los enemigos mas otros controles
		boolean fin=false;
		while(!ganar && !fin){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Entidad e: Enemigos)
				e.turno();
				
			
			
			
			
			
			
		}
		
		
	}
	
	

}
