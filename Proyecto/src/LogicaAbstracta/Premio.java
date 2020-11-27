package LogicaAbstracta;

public abstract class Premio extends Entidad {
	
public  void eliminar() {
			
		miGrafico.eliminar();
		miNivel.removeEntidad(this);
	
	}
	
}
