package Factory;

import Juego.Nivel;
import Logica.EnemigoAlpha;
import LogicaAbstracta.Enemigo;

public class FabricaEnemigoAlpha extends FabricaEnemigo {

	protected static FabricaEnemigoAlpha instancia=null;

	public static FabricaEnemigoAlpha getFabricaEnemigoAlpha() {
		if(instancia==null) 
			instancia=new FabricaEnemigoAlpha();
		return instancia;
	}

	@Override
	public Enemigo crearEnemigo(Nivel n,int x,int y) {
		EnemigoAlpha e= new EnemigoAlpha(n,x,y);  //LR: El que hizo la clase EnemigoAlpha escribame pls.
		return e;							//podiste averlo mandado por discord, pensalo asi, cada enemigo se creara desde el nivel, por lo que eso lo podes pedir por parametro
	}										//los otros dos enteros son la posicion inicial hacelo de manera aleatoria o como te convenga
	
	private FabricaEnemigoAlpha() {
		super();
	}
	
}
