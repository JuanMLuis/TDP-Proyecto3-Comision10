package Hilos;

import Juego.Juego;

public class MovimientoDelJuego extends Thread{	//esta clase no esta en el UML, pero la veo necesaria
	//en sintesis aca se vera la sucesion de eventos y controles durante el juego
	//debe llamarse al comando run una vez inicializado todo (probablemente despues del boton de inicio que quiere hacer Leo)
	protected static boolean GameOver;
	protected Juego miJuego;
	protected static boolean fin=false;

	public MovimientoDelJuego(Juego j){
		miJuego=j;
		GameOver=false;
	}


	public void run() {	
		while(!fin){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			miJuego.turnoEnemigos();
		}
	}

	public static void fin() {
		fin=true;
	}
}
