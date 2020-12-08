package LogicaAbstracta;

public abstract class Proyectil extends Entidad  {

	protected int da�o;

	public int miDa�o() {
		return da�o;
	}

	protected void aceptame(Personaje e) {	
		e.aceptarProyectil(this);
	}

	public void ImpactarPersonaje(Personaje pj) {
		pj.RecibirDa�o(da�o);
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
