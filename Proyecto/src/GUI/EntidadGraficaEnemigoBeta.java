package GUI;

import javax.swing.JLabel;
import LogicaAbstracta.Entidad;

public class EntidadGraficaEnemigoBeta extends EntidadGrafica {
	
	public EntidadGraficaEnemigoBeta(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setBounds(x,y,40, 40);//buscar el tama�o que convenga
		acomodarImagen("img\\bombardero.png");
		e.getNivel().getJuego().getGUI().getlabel().add(miGrafico);
		miGrafico.setVisible(true);
		
	}
	
}
