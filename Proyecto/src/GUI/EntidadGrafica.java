package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
		
		protected JLabel miGrafico;
	
	public void ActualizarPosicion(int posX,int posY) {
		miGrafico.setLocation(posX, posY);
	}
	
	public void setGrafico(ImageIcon i) {
		miGrafico.setIcon(i);
		
	}

	public void eliminar() {
		miGrafico.setIcon(null);
												//redefinir metodo para casos con animaciones
		
	}
}
