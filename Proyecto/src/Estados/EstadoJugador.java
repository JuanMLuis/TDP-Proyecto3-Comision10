package Estados;

import Logica.ProyectilEnemigo;
import Logica.ProyectilAliado;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.Proyectil;

public class EstadoJugador extends Estado {
	
	public EstadoJugador(Personaje e) {
		miEntidad=e;
	}


	@Override
	public void disparar() {		
		int x=miEntidad.getCorx()+10;		 //el proyectil acualmente va a estar corrido (hay que ajustarlo)
		int y=miEntidad.getCorY()+10;
		new ProyectilAliado(x,y,miEntidad.getNivel());
	}



	
}
