package LogicaAbstracta;


public abstract class ProyectilEnemigo extends Proyectil {


	protected void aceptame(Personaje e) {
		e.aceptarProyectilEnemigo(this);
	}



	public void turno(){

		//chequeo de colision
		for(int i=0;i<velocidad;i++) {
			moverse('s');
		}

		colision();


	}
}
