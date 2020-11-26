package GUI;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import LogicaAbstracta.Entidad;

public abstract class EntidadGrafica {
		
		protected JLabel miGrafico;
		protected Entidad miEntidad;
	
	public void ActualizarPosicion(int posX,int posY) {
		miGrafico.setLocation(posX, posY);
	}
	
	public void setGrafico(ImageIcon i) {
		miGrafico.setIcon(i);
		
	}

	public void eliminar() {
		miGrafico.setIcon(null);
		miEntidad.getNivel().getJuego().getGui().remove(miGrafico);//borrar toda referencia del label de la grafica (quizas no funcione asi, depende de como funcione la GUI)
		//redefinir metodo para casos con animaciones
		
	}
	
	protected void acomodarImagen(String img) {
		ImageIcon aux=new ImageIcon(img);
		Icon toChange= new ImageIcon(aux.getImage().getScaledInstance(miGrafico.getWidth(), miGrafico.getHeight(), Image.SCALE_DEFAULT));
		miGrafico.setIcon(toChange);
		
		//para que esto funcione habria que cambiar el nombre de la imgen con la direccion a esta o traer la imagen a la carpeta donde se le llama
	}
	public JLabel getLabel() {
		return miGrafico;
	}
	
	public Rectangle hitbox() {
		return miGrafico.getBounds();
		//miGrafico.getBounds().intersect();
	}
}
