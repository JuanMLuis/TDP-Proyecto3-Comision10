package Logica;

import Estados.EstadoArmaSanitaria;
import LogicaAbstracta.Enemigo;
import LogicaAbstracta.Estado;
import LogicaAbstracta.Premio;

public class EfectoTemporal extends Premio{
	protected Enemigo enemigo;
	
	public void turno() {
		
	}
	
	public void cuarentenaObligatoria(float r1, float r2) { 
		float empieza;
		float termina;
		if(r1 < r2) { 
			empieza = r1;
			termina = r2;
		}
		else { 
			empieza = r2;
			termina = r1;
		}
		while(empieza < termina) {
			enemigo.moverse('n'); //los enemigos no se mueven
			empieza++;
		}
		
	}
	
	public Estado superArmaSanitaria(float r1, float r2) { 
		float empieza;
		float termina;
		Estado arma = new EstadoArmaSanitaria(); 
		if(r1 < r2) { 
			empieza = r1;
			termina = r2;
		}
		else { 
			empieza = r2;
			termina = r1;
		}
		while(empieza < termina) { 
			//poder de desinfeccion del arma
			empieza++;
		}
		return arma;
	}

}
