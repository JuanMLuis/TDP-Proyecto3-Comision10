package Estados;

import LogicaAbstracta.Entidad;
import LogicaAbstracta.Estado;

public class EstadoEnemigo extends Estado{
	
	public EstadoEnemigo(Entidad e) {
		miEntidad=e;
	}

	@Override
	public void disparar(int r) {
	
	}

	@Override
	public void movimiento(char c, int v) {
		for(int i=0;i<=v;i++) {
			miEntidad.moverse(c);//se mueve v veces en direccion c
		}
	}

}
