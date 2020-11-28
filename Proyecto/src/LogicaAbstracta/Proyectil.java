package LogicaAbstracta;

public abstract class Proyectil extends Entidad  {
	
	protected int da�o;
	protected int rango;//cuando rango llega a 0 se elimina, de esta manera evitamos tener proyectiles actualizandoce en el infinito

	@Override
	public void turno() {
	}
	
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
