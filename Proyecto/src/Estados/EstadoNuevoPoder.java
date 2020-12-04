package Estados;

import Logica.ProyectilEspecial;
import Logica.proyectilAliado;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;

public class EstadoNuevoPoder extends Estado{

	public EstadoNuevoPoder(Personaje p) {
		miEntidad = p;
	}

	public void disparar() {
		int x=miEntidad.getCorx()+10;		 //el proyectil acualmente va a estar corrido (hay que ajustarlo)
		int y=miEntidad.getCorY()+10;
		new ProyectilEspecial(x,y,miEntidad.getNivel());
	}

	public void movimiento(char c, int v) {
		for(int i=0;i<=v;i++) {
			miEntidad.moverse(c);
		}
	} 
}