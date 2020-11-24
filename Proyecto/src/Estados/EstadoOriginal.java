package Estados;

import LogicaAbstracta.Estado;

public class EstadoOriginal extends Estado {
	
	public EstadoOriginal() { 
		
	}

	@Override
	public void disparar(int r) {		//por ahora no lo necesitamos implementado
		int x = miEntidad.getCorx();
		int y = miEntidad.getCorY();
		
	}

	@Override
	public void movimiento(char c, int v) {
	
		
	}

	@Override
	public void recivirDaño(int dmg) {
		int aux=(miEntidad.getVida()-dmg);
		if(aux<=0) {
			miEntidad.Eliminar();
		}else
			miEntidad.setVida(aux);
		
	}

}
