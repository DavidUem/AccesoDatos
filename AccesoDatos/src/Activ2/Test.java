package Activ2;

import java.io.File;

public class Test {


	public static void main(String[] args) {
		Metodos m = new Metodos();
		// TODO Apéndice de método generado automáticamente
System.out.println("Información sobre el fichero");
File f = new File("src");
if (f.exists()){
	System.out.println("Existe el fichero: " + f.exists());
}
//-------------------------------------------------------------
System.out.println("Información sobre la ruta");

File rut = new File(".");
if (rut.exists()){
	System.out.println("La ruta absoluta es: " +rut.getAbsolutePath());
}
//-------------------------------------------------------------
System.out.println("Nuevo directorio");
File dic = new File("src");
if (dic.exists()){
	System.out.println("Se ha creado: "+ dic.mkdir());
}
//-------------------------------------------------------------
System.out.println("Renombrar archivo");
File fichPrueba = new File("prueba");
m.renombraFichero("prueba", "nuevo");
System.out.println("existe fichero prueba:"+m.existeFichero("prueba"));
System.out.println("existe fichero prueba:"+m.existeFichero("nuevo"));

}}
