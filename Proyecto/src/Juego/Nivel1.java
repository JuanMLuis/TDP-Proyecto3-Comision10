package Juego;

import java.util.ArrayList;

import Logica.EnemigoAlpha;
import Logica.EnemigoBeta;
import Logica.Jugador;
import LogicaAbstracta.Entidad;

public class Nivel1 extends Nivel{
	
	public Nivel1 (Juego j) {
		miJuego=j;
		Enemigos= new ArrayList<Entidad>();//Recordar de eliminar los jugadores de los siguientes niveles.
		CantEnemigosVivos=20;
		Enemigos.add(new EnemigoAlpha(this, 60, 60));
		Enemigos.add(new EnemigoAlpha(this,150,60));
		Enemigos.add(new EnemigoAlpha(this,200,60));
		Enemigos.add(new EnemigoAlpha(this,260,60));
		Enemigos.add(new EnemigoAlpha(this,310,60));
		Enemigos.add(new EnemigoBeta(this, 380, 60));
		Enemigos.add(new EnemigoBeta(this, 460, 60));
		Enemigos.add(new EnemigoBeta(this, 530, 60));
		Enemigos.add(new EnemigoBeta(this, 670, 60));
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

	public Jugador getJugador() {
		return jugador;
	}
	

}
