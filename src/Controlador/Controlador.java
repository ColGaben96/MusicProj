package Controlador;

import Modelo.Mundo;
import Modelo.Persistencia;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo (mundo) 
	Persistencia BD;
	private Mundo bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
	
		bd = new Mundo();
		gui = new Interfaz();

		//aqui van los m�todos que se invocan de Modelo (Mundo) y de Vista y que ejecutar�n el programa.
		
		bd.getA().EscribirArchivo(bd.getDato());
		bd.getP().getPropiedades();
		gui.escribirDato(bd.getA().LeerArcivo());
	}

}
