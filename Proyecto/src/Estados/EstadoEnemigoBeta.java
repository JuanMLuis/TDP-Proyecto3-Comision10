package Estados;

import Logica.ProyectilEnemigoBeta;
import LogicaAbstracta.Entidad;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.ProyectilEnemigo;

public class EstadoEnemigoBeta extends Estado{
	
	public EstadoEnemigoBeta(Personaje e) {
		miEntidad=e;
	}

	public void disparar() {
		int x= miEntidad.getCorx()+10;		 //el proyectil acualmente va a estar corrido (hay que ajustarlo)
		int y=miEntidad.getCorY()+10;
		new ProyectilEnemigoBeta(x,y,miEntidad.getNivel());
	}


}