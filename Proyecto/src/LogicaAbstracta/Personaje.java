package LogicaAbstracta;

import Logica.Jugador;

public abstract class Personaje extends Entidad  {

	protected VisitorAbstracto miVisitor;
	protected int vida;
	protected int cooldown;
	protected int cooldownOriginal;   // guardamos el valor orginal para los reset del cooldown
	protected Estado estadoActual;
	protected char direccionActual;
	protected int dmg; 					//los personajes disparan y mandan su da�o a los proyectiles



	public void disparar() {
		if(cooldown==0) {
			estadoActual.disparar();
			resetCooldown();
		}

	}

	protected abstract void resetCooldown();

	public  void cambiarEstado(Estado est) {
		estadoActual=est;
	}

	public void RecibirDa�o(int dmg) {
		estadoActual.recibirDa�o(dmg);
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
	public void aceptarProyectil(Proyectil p) {
		miVisitor.aceptarProyectil(p);
	}
	public void aceptarProyectilEnemigo(ProyectilEnemigo p) {
		miVisitor.aceptarProyectilEnemigo(p);
	}
	
	public void aceptarSe�alJugador(Jugador j) {
		miVisitor.aceptarSe�alJugador(j);
	}

	

}
