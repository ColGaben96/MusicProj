package Modelo;

import java.util.Random;

//Representa el mundo del problema: las clases y m�todos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	Persistencia BD;//se asocia a Mundo para que �ste pueda interactuar con la data de Persistencia.
	private String dato; // atributo ejemplo que se va a cargar por un m�todo de vista
	private Archivo a;
	private Propiedades p;

	public Propiedades getP() {
		return p;
	}

	public void setP(Propiedades p) {
		this.p = p;
	}

	public Archivo getA() {
		return a;
	}

	public void setA(Archivo a) {
		this.a = a;
	}

	public Mundo() {
		// TODO Auto-generated constructor stub
		dato="";
		BD = new Persistencia();
		a = new Archivo();
	}

	//getter para el atributo ejemplo
	

	//setter para el atributo ejemplo
	public String getDato() {
		
		int r, m, n;	
		for(n = 0; n <= 4 ; n++) 
		{
			for(m=0;m<=5;m++) 
			{
				for(r=0;r<=5;r++) 
				{
					Random rand = new Random();
					int i = rand.nextInt( 4 );
					dato += BD.parte[i][r];
				}
				dato += "\n";
			}
			dato += "\n \n";
		}
		return dato;
	}



	/* metodo que realiza un proceso basado en un atributo dato (ejemplo)  
	 * Reemplazar por lo que se necesiten
	 */

	
}
