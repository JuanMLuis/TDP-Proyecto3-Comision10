package Testeos;

import GUI.Inicio;


public class Testeos {//se creo con el unico fin de probar cosas, son libres de hacer lo que quieran aca

	protected static boolean empieza;
	
	public static void main(String[] args) {
		empieza=false;
		Inicio ini= new Inicio();
		ini.setVisible(true);
		while(!empieza) {
			try {		//si no pones nada en el medio no podes parar el ciclo
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ini.rJ().startJuego();
	}
	
	public static void empezar() {
		empieza=true;
	}
}
