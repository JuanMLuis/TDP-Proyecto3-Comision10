package Factory;

import Juego.Nivel;
import LogicaAbstracta.Enemigo;

public abstract class FabricaEnemigo {
	
	public abstract Enemigo crearEnemigoAlpha(Nivel n,int x,int y); 
	public abstract Enemigo crearEnemigoBeta(Nivel n,int x,int y); 
	 
}
