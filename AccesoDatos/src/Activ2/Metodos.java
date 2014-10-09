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
public String contenidoDirectorio(String ruta){
	File f= new File("src");
	String[] archivos = f.list();
	for (int i=0; i< archivos.length;i++){
		System.out.println(archivos[i]);
	}
	return null;
}

public String[] datosFicheros(String Fichero){
	File f= new File("\\Users");
	File p = new File("\\Users\\ReadMe.txt");
	String[] resultado = new String[5];
	
	
	if (f.exists()){
		resultado[0]= f.getName();
		System.out.println("Ruta Absoluta: " + f.getAbsolutePath());
		resultado[2] = String.valueOf(f.canRead());
		System.out.println("Permisos de escritura: " + f.canWrite());
		System.out.println("Tamano en bytes " + f.length());
		System.out.println("Si es directorio: " + f.isDirectory());
		System.out.println("Directorio Padre: " + p.isDirectory());
		
		String[] datos={f.getName(),f.getAbsolutePath()};
		
	}
	
	else {
		System.out.println("Directorio no existe");
	}
	
	return resultado;

	}
}



