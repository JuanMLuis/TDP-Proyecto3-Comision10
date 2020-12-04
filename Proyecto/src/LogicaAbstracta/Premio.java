package LogicaAbstracta;

public abstract class Premio extends Entidad {
	
public  void eliminar() {
			
		miGrafico.eliminar();
		miNivel.removeEntidad(this);
	
	}
	public void Aceptame(Personaje e) {
		e.aceptarPremio(this);
	}
}
