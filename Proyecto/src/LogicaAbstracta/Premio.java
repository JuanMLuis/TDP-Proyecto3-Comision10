package LogicaAbstracta;

public abstract class Premio extends Entidad {
	
public  void eliminar() {
			
		miGrafico.eliminar();
		miNivel.removeEntidad(this);
	
	}
	public void aceptame(Personaje e) {
		e.aceptarPremio(this);
	}
	
	public abstract void activar();
}
