package Activ2;

import java.io.File;

public class Metodos {
	File fichero;
	File fichero1;
	File fichero2;
	
public boolean existeFichero(String ficheros){
		fichero= new File(ficheros);
		return fichero.exists();
		
	}

public String ruta(String rutaRelativa){
	fichero1= new File(rutaRelativa);
	return fichero1.getAbsolutePath();
}
public boolean creaDirectorio(String ruta){
	fichero2= new File("Prueba");
	return fichero2.mkdir();
}

public boolean renombraFichero(String viejo, String nuevo){
	File fichero= new File(viejo);
	File ff= new File(nuevo);
	if (fichero.renameTo(ff)){
		return true;
	
	}
	return false;
}





}
