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

	@Override
	public void movimiento(char c, int v) {
		for(int i=0;i<=v;i++) {
			miEntidad.moverse(c);
		}
		
	}

	@Override
	public void recibirDaño(int dmg) {
		int aux=(miEntidad.getVida()-dmg);
		if(aux<=0) {
			miEntidad.Eliminar();
		}else
			miEntidad.setVida(aux);
		
	}
	
	public void paralisis() { 
		miEntidad.setVelocidad(0);
	}

}
