package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
		
		protected JLabel miGrafico;
	
	public abstract void AvtualizarPosicion();
	
	public void setGrafico(ImageIcon i) {
		miGrafico.setIcon(i);
		
	}
}
