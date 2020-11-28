package LogicaAbstracta;

public abstract class Proyectil extends Entidad  {
	
	protected int da�o;

	
	public int miDa�o() {
		return da�o;
	}

	@Override
	protected void Aceptame(Entidad e) {
		
		e.AceptarProyectil(this);
	}
	
	public void ImpactarPersonaje(Personaje pj) {
		pj.RecibirDa�o(da�o);
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
