package LogicaAbstracta;

public class Proyectil extends Entidad  {
	
	protected int daño;
	protected int rango;//cuando rango llega a 0 se elimina, de esta manera evitamos tener proyectiles actualizandoce en el infinito

	@Override
	public void turno() {
		// TODO Auto-generated method stub
		
	}
	
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
