package Estados;

import LogicaAbstracta.Entidad;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;
import LogicaAbstracta.ProyectilEnemigo;

public class EstadoEnemigoAlpha extends Estado{
	
	public EstadoEnemigoAlpha(Personaje e) {
		miEntidad=e;
	}

	public void disparar() {
		int x= miEntidad.getCorx()+10;		 //el proyectil acualmente va a estar corrido (hay que ajustarlo)
		int y=miEntidad.getCorY()+10;
		new ProyectilEnemigo(x,y,miEntidad.getNivel());
	}


}
