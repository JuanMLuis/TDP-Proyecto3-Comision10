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
		new ProyectilEnemigo(x,y,miEntidad.getNivel(),r);
	}

	@Override
	public void movimiento(char c, int v) {
		for(int i=0;i<=v;i++) {
			miEntidad.moverse(c);//se mueve v veces en direccion c
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
