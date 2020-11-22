package Factory;

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
	public Enemigo crearEnemigo() {
		EnemigoAlpha e= new EnemigoAlpha();  //LR: El que hizo la clase EnemigoAlpha escribame pls.
		return e;
	}
	
	private FabricaEnemigoAlpha() {
		super();
	}
	
}
