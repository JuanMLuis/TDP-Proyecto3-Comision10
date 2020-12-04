package Estados;

import LogicaAbstracta.Estado;
import LogicaAbstracta.Personaje;

public class EstadoAuxiliar extends Estado {//LR: La hice para probar unas cosas y no modificar su codigo.
	
	public EstadoAuxiliar(Personaje e) { 
		miEntidad=e;
		
	}

	@Override
	public void disparar() {		//por ahora no lo necesitamos implementado
		int x = miEntidad.getCorx();
		int y = miEntidad.getCorY();
		
	}

	@Override
	public void movimiento(char c, int v) {
	
		miEntidad.moverse(c);
	}

	@Override
	public void recibirDaño(int dmg) {
		int aux=(miEntidad.getVida()-dmg);
		if(aux<=0) {
			miEntidad.eliminar();
		}else
			miEntidad.setVida(aux);
		
	}
}
