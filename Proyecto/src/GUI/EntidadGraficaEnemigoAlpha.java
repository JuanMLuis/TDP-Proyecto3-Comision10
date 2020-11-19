package GUI;

import java.awt.Image;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaEnemigoAlpha extends EntidadGrafica {
	
	public EntidadGraficaEnemigoAlpha(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setBounds(10,40,40, 40);//buscar el tamaño que convenga
		acomodarImagen("interceptor.png");
		e.getNivel().getJuego().getGui().getlabel().add(miGrafico);
		miGrafico.setVisible(true);
	}
	
}
