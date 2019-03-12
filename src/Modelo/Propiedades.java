package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades 
{
	private Properties prop = new Properties();
	private String arcpropiedades = "\\home\\gabe\\Desktop\\ets.properties";
	
	public void setPropiedades()
	{
		try 
		{
			prop.setProperty("nombreArchivo", "\\home\\gabe\\Desktop\\ets.txt");
			prop.setProperty("archivoProp", "\\home\\gabe\\Desktop\\ets.properties");
			prop.setProperty("nombreCodigo", "prop.java");
			prop.store(new FileOutputStream(arcpropiedades), null);
		} 
		catch (IOException ex) 
		{
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
	
	public void getPropiedades()
	{
		try 
		{
			prop.load(new FileInputStream(arcpropiedades));
			prop.list(System.out);
			System.out.println(prop.getProperty("nombreArchivo"));
			System.out.println(prop.getProperty("archivoProp"));
			System.out.println(prop.getProperty("nombreCodigo"));
		} 
		catch (IOException ex) 
		{
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
}
