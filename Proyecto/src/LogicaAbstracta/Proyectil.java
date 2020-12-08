package LogicaAbstracta;

public abstract class Proyectil extends Entidad  {

	protected int daño;

	public int miDaño() {
		return daño;
	}

	protected void aceptame(Personaje e) {	
		e.aceptarProyectil(this);
	}

	public void ImpactarPersonaje(Personaje pj) {
		pj.RecibirDaño(daño);
		this.eliminar();
	}

	public  void eliminar() {
		miGrafico.eliminar();
		miNivel.removeEntidad(this);	
	}

	public synchronized void moverse(char s) {
		super.moverse(s);
		if(posY==0)
			eliminar(); 
	}
}
