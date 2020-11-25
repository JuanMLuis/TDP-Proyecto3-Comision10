package GUI;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaJugador extends EntidadGrafica {
	
	public EntidadGraficaJugador(int x,int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setBounds(343,400,40, 40);//buscar el tamaño que convenga
		acomodarImagen("nave_jugador.png");
		e.getNivel().getJuego().getGui().getlabel().add(miGrafico);
		miGrafico.setVisible(true);
		miGrafico.setFocusable(true);
	}
	


}
