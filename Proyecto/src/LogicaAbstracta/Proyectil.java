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

	
}
