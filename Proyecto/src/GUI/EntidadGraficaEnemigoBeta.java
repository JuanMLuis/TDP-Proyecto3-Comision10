package GUI;

import java.awt.Image;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaEnemigoBeta extends EntidadGrafica {
	
	public EntidadGraficaEnemigoBeta(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setSize(20, 20);//buscar el tamaño que convenga
		acomodarImagen("interceptor.png");
		
	}
	
}
