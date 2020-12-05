package Hilos;

import Juego.Juego;
import LogicaAbstracta.Entidad;

public class MovimientoDelJuego extends Thread{	//esta clase no esta en el UML, pero la veo necesaria
												//en sintesis aca se vera la sucesion de eventos y controles durante el juego
												//debe llamarse al comando run una vez inicializado todo (probablemente despues del boton de inicio que quiere hacer Leo)
	protected static boolean GameOver;
	protected Juego miJuego;
	
	public MovimientoDelJuego(Juego j){
		miJuego=j;
		GameOver=false;
	}
	
	
	public void run() {
		boolean fin=false;
		
		while(!fin && !GameOver){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			miJuego.turnoEnemigos();
			
			
		}
		if(!GameOver) {//si no es por Game Over aca va el nivel 2
			
			
			
			
			
		}
		
		
		
	}
	
	public static void GameOver() {
		GameOver=true;
	}
	
}
