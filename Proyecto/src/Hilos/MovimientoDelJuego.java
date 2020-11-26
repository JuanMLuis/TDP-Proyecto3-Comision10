package Hilos;

import Juego.Juego;
import LogicaAbstracta.Entidad;

public class MovimientoDelJuego extends Thread{	//esta clase no esta en el UML, pero la veo necesaria
												//en sintesis aca se vera la sucesion de eventos y controles durante el juego
												//debe llamarse al comando run una vez inicializado todo (probablemente despues del boton de inicio que quiere hacer Leo)

	protected Juego miJuego;
	
	public MovimientoDelJuego(Juego j){
		miJuego=j;
	}
	
	
	public void run() {
		boolean fin=false;
		
		while(!fin){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			miJuego.TurnoEnemigos();
			
			
		}
		
		
		
	}
	
}
