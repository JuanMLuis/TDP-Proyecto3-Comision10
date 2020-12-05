package Factory;

import Juego.Nivel;
import Logica.EnemigoAlpha;
import Logica.EnemigoBeta;
import LogicaAbstracta.Enemigo;

public class FabricaEnemigos extends FabricaEnemigo {

	protected static FabricaEnemigos instancia=null;

	public static FabricaEnemigos getFabricaEnemigos() {
		if(instancia==null) 
			instancia=new FabricaEnemigos();
		return instancia;
	}

	public Enemigo crearEnemigoAlpha(Nivel n,int x,int y) {
		EnemigoAlpha e= new EnemigoAlpha(n,x,y); 
		return e;							
	}										
	
	private FabricaEnemigos() {
		super();
	}


	public Enemigo crearEnemigoBeta(Nivel n, int x, int y) {
		EnemigoBeta e= new EnemigoBeta(n,x,y);
		return e;
	}
	
}
