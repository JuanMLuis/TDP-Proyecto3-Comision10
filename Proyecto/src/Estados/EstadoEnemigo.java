package Estados;

import Logica.ProyectilEnemigo;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;

public class EstadoEnemigo extends Estado{
	
	public EstadoEnemigo(Personaje e) {
		miEntidad=e;
	}

	@Override
	public void disparar(int r) {
		int x= miEntidad.getCorx()+10;		 //el proyectil acualmente va a estar corrido (hay que ajustarlo)
		int y=miEntidad.getCorY()+10;
		new ProyectilEnemigo(x,y,miEntidad.getNivel());
	}


}
