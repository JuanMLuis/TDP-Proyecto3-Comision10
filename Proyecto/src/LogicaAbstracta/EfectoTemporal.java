package LogicaAbstracta;


import java.util.Timer;

public abstract class EfectoTemporal extends Premio{ //cada uno de los metodos separarlos en 2 clases distintas
	protected Timer timer;

	public void turno() {
		for(int i = 0; i < velocidad; i++)
			moverse('s');
			colision();
	}
}
