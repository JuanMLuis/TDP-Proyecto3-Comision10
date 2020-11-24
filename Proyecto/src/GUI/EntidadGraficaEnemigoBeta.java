package GUI;

import java.awt.Image;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaEnemigoBeta extends EntidadGrafica {
	
	public EntidadGraficaEnemigoBeta(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setBounds(x,y,40, 40);//buscar el tamaño que convenga
		acomodarImagen("interceptor.png");
		e.getNivel().getJuego().getGui().getlabel().add(miGrafico);
		miGrafico.setVisible(true);
		
	}
	
}
