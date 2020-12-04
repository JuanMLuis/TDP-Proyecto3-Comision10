package LogicaAbstracta;


import java.util.Timer;
import java.util.TimerTask;

public abstract class EfectoTemporal extends Premio{ //cada uno de los metodos separarlos en 2 clases distintas
	protected Timer timer;
	protected int fin=100;

	public void turno() {
	if(posY<=430) {
		for(int i = 0; i < velocidad; i++)
			moverse('s');
	}else
		fin--;
	
	if(fin==0)
		eliminar();
	
	
	
		colision();
	}

}
