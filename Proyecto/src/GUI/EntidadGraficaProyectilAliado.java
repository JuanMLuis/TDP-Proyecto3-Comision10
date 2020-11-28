package GUI;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaProyectilAliado extends EntidadGrafica{
	
	public EntidadGraficaProyectilAliado(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setBounds(x,y,5, 10);//buscar el tama�o que convenga
		e.getNivel().getJuego().getGui().getlabel().add(miGrafico);

		acomodarImagen("img\\disparoverde.png");

		miGrafico.setVisible(true);
	}
}
