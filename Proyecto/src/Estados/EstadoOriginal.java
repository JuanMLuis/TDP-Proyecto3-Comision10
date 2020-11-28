package Estados;

import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;

public class EstadoOriginal extends Estado {
	
	public EstadoOriginal(Personaje e) {
		miEntidad=e;
	}


	@Override
	public void disparar(int r) {		//por ahora no lo necesitamos implementado
		int x = miEntidad.getCorx();
		int y = miEntidad.getCorY();
		
	}



	
}
