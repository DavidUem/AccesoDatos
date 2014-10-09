package Activ2;

import java.io.File;

public class Test {


	public static void main(String[] args) {
	
		Metodos m = new Metodos();
// Método ruta relativa		
System.out.println(m.ruta("\\Users"));

// Método mostrar contenido directorio
System.out.println(m.contenidoDirectorio("src"));

//Método comprobar si existe un fichero
System.out.println(m.existeFichero("\\Users\\ReadMe.txt"));

//Crear directorio
System.out.println(m.creaDirectorio("\\Users"));

m.datosFicheros(".");
	}
	
}
	
	
