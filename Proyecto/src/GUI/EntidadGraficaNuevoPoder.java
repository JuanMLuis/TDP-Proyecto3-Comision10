package GUI;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaNuevoPoder extends EntidadGrafica{
	 
	public EntidadGraficaNuevoPoder(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setBounds(x,y,40, 40);//buscar el tamaño que convenga
		acomodarImagen("img\\premioArma.png");
		e.getNivel().getJuego().getGui().getlabel().add(miGrafico);
		miGrafico.setVisible(true);	
	}
}
