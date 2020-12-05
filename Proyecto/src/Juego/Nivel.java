package Juego;

import Logica.Jugador;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Personaje;

import java.util.ArrayList;

import Factory.FabricaEnemigo;
import Factory.FabricaEnemigos;

public abstract class Nivel{

	protected ArrayList<ArrayList<Personaje>> enemigos;	
	protected  ArrayList<Entidad> Entidades;		//dira de poner aca a todas las entidades menos Enemigos y al jugador
	protected Jugador jugador  ;//Poner get y mandarlo a Juego y de ahi mandarlo a la GUI
	protected Juego miJuego;
	protected int cantOleadas;
	protected boolean ganar;
	

	public void removeEnemigo(Personaje p) {
		enemigos.get(0).remove(p);
	}

	public Juego getJuego() {
		return miJuego;
	}

	//quizas se podria hacer el Nivel como un hilo y no tenerlo como clase aparte, nunca hablamos de esto solo lo dejo como idea

	public ArrayList<Personaje> colision(Entidad e) {//retorna null si no hay colicion, retona la primera entidad con la que coliciona
		ArrayList<Personaje> colisiones = new ArrayList<Personaje>();
		if(jugador!=e && jugador.getHitbox().intersects(e.getHitbox()))
			colisiones.add(jugador);
		for(Personaje r: enemigos.get(0)) {
			if(e!=r &&  r.getHitbox().intersects(e.getHitbox()))
				colisiones.add(r);
		}
		return colisiones;
	}

	public void setJugador(Jugador jugador2) {
		jugador=jugador2;
	}

	public  void  turno() {
		if(!enemigos.isEmpty()) {
		ArrayList<Entidad> aux= new ArrayList<Entidad>();	
		for(Entidad e: enemigos.get(0))								//este paso extra evita un error que se producia
			aux.add(e);
		for(Entidad r: Entidades)
			aux.add(r);
		MoverEntidades(aux);
		jugador.turno();
		comprobarLista();
		}else {
			//fin de lvl:
		}
	}

	public void addEnemigo(Enemigo e) {
		enemigos.get(0).add(e);

	}

	public void addEntidad(Entidad p) {
		Entidades.add(p);

	}

	public ArrayList<Personaje> mandarSeñal(Entidad e) {				//devuelve la lista de las entidades frente a "e"
		ArrayList<Personaje> toReturn = new ArrayList<Personaje>();
		for(Personaje r: enemigos.get(0)) {
			if(r.getCorx()-20<=e.getCorx()&&r.getCorx()+20>=e.getCorx()) { //los 20 son aplitud, para que dispare aunque el enemigo no este 100% centrado
				toReturn.add(r);
			}
		}
		return toReturn;
	}

	public ArrayList<Personaje> getEnemigos() { 
		return enemigos.get(0);
	}

	public void removeEntidad(Entidad e) {
		Entidades.remove(e);

	}

	protected void MoverEntidades(ArrayList<Entidad> list) {
		for(Entidad e: list )
			e.turno();
	}

	public void reset() {
		ArrayList<Entidad> aux= new ArrayList<Entidad>();
		for(ArrayList<Personaje> lista: enemigos) {
			for(Entidad e:lista)
				aux.add(e);
		}
		for(Entidad e:Entidades)
			aux.add(e);

		for(Entidad e:aux)
			e.eliminar();
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void comprobarLista() { 
		if(enemigos.get(0).isEmpty())
			enemigos.remove(0);
		
	}
	
	protected void crearOleadas(int cantEnemigos) { 
		ArrayList<Personaje> oleada;
		int x = 0;
		int y = -50;
		FabricaEnemigo enemigo = FabricaEnemigos.getFabricaEnemigos();
		for(int i = 0; i < cantOleadas; i++) { 
			oleada = new ArrayList<Personaje>();
			while(oleada.size() < cantEnemigos) { 
				x++;
				
				int VariacionX= (int)(Math.random()*20)+1;
				int VariacionY=(int)((Math.random()*6)+1)*-1;
				
				
				int aux=(int)(Math.random()*2+1);
				if(aux==1)
				oleada.add(enemigo.crearEnemigoAlpha(this,( x * 60) + VariacionX, y+VariacionY));
				else
				oleada.add(enemigo.crearEnemigoBeta(this,( x * 60) + VariacionX, y+VariacionY));
				
				
				if(x >= 10) {
					y = y - 60;
					x=1;
				}
			}
			enemigos.add(oleada);
		}
			
	}
}

