import java.io.File;
import java.util.Map;
import java.util.Properties;


public class Programa {

    public static void main(String[] args) {
  	 String cadena;

  	 Map<String, String> mapa = System.getenv();
  	 System.out.println(mapa.toString().replace(", ", String.valueOf('\n')).replaceAll("=", " = "));
  	 System.out.println("\n\n");

  	 Properties propiedades = System.getProperties();
  	 System.out.println(propiedades.toString().replace(", ", String.valueOf('\n')).replaceAll("=", " = "));
  	 System.out.println("\n\n");

  	 if (System.getProperty("os.name").equals("Linux")){
  		 cadena = "/";
  	 } else {
  		 cadena = "\\";
  	 }
  	
  	 String cadena2 = System.getProperty("user.home");
  	 File fichero = new File(cadena2 + cadena + "info");
  	 if (! fichero.exists()) {
  		 System.out.println("Creando " + fichero);
  		 fichero.mkdirs();
  	 } else {
  		 System.out.println(fichero + " ya existe." );
  	 }
    }
}