package LogicaAbstracta;

import Logica.Jugador;
import Logica.ProyectilEnemigo;

public abstract class Personaje extends Entidad  {

	protected VisitorAbstracto miVisitor;
	protected int vida;
	protected int rango;
	protected int cooldown;
	protected int cooldownOriginal;   // guardamos el valor orginal para los reset del cooldown
	protected Estado estadoActual;
	protected char direccionActual;
	protected int dmg; 					//los personajes disparan y mandan su daņo a los proyectiles



	public void disparar() {
		if(cooldown==0) {
			estadoActual.disparar(rango);
			resetCooldown();
		}

	}

	protected abstract void resetCooldown();

	public  void cambiarEstado(Estado est) {
		estadoActual=est;
	}

	public void RecibirDaņo(int dmg) {
		estadoActual.recibirDaņo(dmg);
		if(vida<=0)
			eliminar();
	}

	public void setVida(int v) {
		vida=v;
	}

	public int getVida() {
		return vida;
	}

	public Estado getEstadoActual() { 
		return estadoActual;
	}
	public void aceptarEnemigo(Enemigo e) {
		miVisitor.aceptarEnemigo(e);
	}
	public void aceptarJugador(Jugador j) {
		miVisitor.aceptarJugador(j);
	}
	public void aceptarPremio(Premio p) {
		miVisitor.aceptarPremio(p);
	}
	public void AceptarProyectil(Proyectil p) {
		miVisitor.aceptarProyectil(p);
	}
	public void AceptarProyectilEnemigo(ProyectilEnemigo p) {
		miVisitor.aceptarProyectilEnemigo(p);
	}
	
	public void aceptarSeņalJugador(Jugador j) {
		miVisitor.aceptarSeņalJugador(j);
	}

	public int getRango() {
		return rango;
	}

}
