package Juego;

import GUI.GUI;
import Hilos.HiloTeclado;
import Hilos.MovimientoDelJuego;
import Logica.Jugador;


public class Juego {
	protected GUI miGui;
	protected Nivel miNivel;
	protected Jugador jugador;

	public Juego(GUI g) {
		miGui=g;
		miNivel=new Nivel1(this);
		jugador= new Jugador(miNivel);
		miNivel.setJugador(jugador);
		miNivel.cambiarNivel();
	}

	public void setGUI(GUI g) {
		miGui=g;
	}

	public GUI getGui() {
		return miGui;
	}

	public void startJuego() {
		HiloTeclado ht=new HiloTeclado(miGui,jugador);
		ht.start();
		new MovimientoDelJuego(this).start();
	}

	public void turnoEnemigos() {
		miNivel.turno();

	}

	public void gameOver() {
		MovimientoDelJuego.fin();
		miNivel.reset();
		miNivel.reset();
		miGui.perder();
	}
	
	public void ganar() {
		MovimientoDelJuego.fin();
		miNivel.reset();
		miGui.ganar();	
	}

	public void actualizarNivel(Nivel n) {
		miNivel=n;
		miNivel.setJugador(jugador);
		jugador.setNivel(n);
		miNivel.cambiarFondo();
		miNivel.cambiarNivel();
		miNivel.getJugador().setVida(100);
	}

}
