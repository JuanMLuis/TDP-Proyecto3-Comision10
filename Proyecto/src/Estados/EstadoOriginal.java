package Estados;

import Logica.ProyectilEnemigo;
import Logica.proyectilAliado;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Proyectil;

public class EstadoOriginal extends Estado {
	
	public EstadoOriginal(Personaje e) {
		miEntidad=e;
	}


	@Override
	public void disparar() {		//por ahora no lo necesitamos implementado
		int x=miEntidad.getCorx()+10;		 //el proyectil acualmente va a estar corrido (hay que ajustarlo)
		int y=miEntidad.getCorY()+10;
		new proyectilAliado(x,y,miEntidad.getNivel());
	}



	
}
