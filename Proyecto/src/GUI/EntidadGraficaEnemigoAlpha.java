package GUI;

import java.awt.Image;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaEnemigoAlpha extends EntidadGrafica {
	
	public EntidadGraficaEnemigoAlpha(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setSize(20, 20);//buscar el tama�o que convenga
		acomodarImagen("interceptor.png");
		
	}
	
}