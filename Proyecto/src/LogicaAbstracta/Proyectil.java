package LogicaAbstracta;

public abstract class Proyectil extends Entidad  {
	
	protected int daño;

	
	public int miDaño() {
		return daño;
	}

	@Override
	protected void Aceptame(Entidad e) {
		
		e.AceptarProyectil(this);
	}
	
	public void ImpactarPersonaje(Personaje pj) {
		pj.RecibirDaño(daño);
		this.eliminar();
		System.out.println("a");
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
