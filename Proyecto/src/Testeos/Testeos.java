package Testeos;

import javax.swing.JFrame;

import GUI.Inicio;
import Juego.Juego;
import Juego.Nivel;
import Juego.Nivel1;

public class Testeos {//se creo con el unico fin de probar cosas, son libres de hacer lo que quieran aca

	public static void main(String[] args) {
		Inicio ini= new Inicio();
		ini.setVisible(true);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ini.rJ().startJuego();

	}

}
