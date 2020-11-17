package GUI;

import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public class EntidadGraficaJugador extends EntidadGrafica {
	
	public EntidadGraficaJugador(int x,int y,Entidad e) {
		miEntidad=e;
		miGrafico=new JLabel();
		miGrafico.setSize(20, 20);//buscar el tamaño que convenga
		acomodarImagen("nave_jugador.png");
		e.getNivel().getJuego().getGui().add(miGrafico);
		miGrafico.setVisible(true);//algo fallo
	}

}
