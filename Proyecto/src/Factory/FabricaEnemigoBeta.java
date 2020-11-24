package Factory;


import Juego.Nivel;
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
	public Enemigo crearEnemigo(Nivel n,int x,int y) {
		EnemigoBeta e= new EnemigoBeta(n,x,y);
		return e;
	}
	
	private FabricaEnemigoBeta() {
		super();
	}

}
