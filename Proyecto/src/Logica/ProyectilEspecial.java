package Logica;

import Juego.Nivel;

public class ProyectilEspecial extends proyectilAliado{

	public ProyectilEspecial(int x, int y, Nivel p) {
		super(x, y, p);
		da�o = da�o * 2; 
		miGrafico.setGrafico("img\\disparomorado.png");
	}
}
