package Factory;


import Logica.EnemigoBeta;
import LogicaAbstracta.Enemigo;

public class FabricaEnemigoBeta extends FabricaEnemigo {
	
	protected static FabricaEnemigoBeta instancia=null;

	public static FabricaEnemigoBeta getFabricaEnemigoAlpha() {
		if(instancia==null) 
			instancia=new FabricaEnemigoBeta();
		return instancia;
	}

	@Override
	public Enemigo crearEnemigo() {
		EnemigoBeta e= new EnemigoBeta();
		return e;
	}
	
	private FabricaEnemigoBeta() {
		super();
	}

}
