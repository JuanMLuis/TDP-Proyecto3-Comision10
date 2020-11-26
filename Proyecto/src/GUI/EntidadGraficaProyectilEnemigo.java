package GUI;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaProyectilEnemigo extends EntidadGrafica {
	public EntidadGraficaProyectilEnemigo(int x, int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setBounds(x,y,20, 20);//buscar el tamaño que convenga
		e.getNivel().getJuego().getGui().getlabel().add(miGrafico);
		acomodarImagen("img\\disparorojo.png");
		miGrafico.setVisible(true);
	}
}
