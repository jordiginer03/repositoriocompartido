import java.io.File;
import java.util.Map;
import java.util.Properties;

/**
* Muestra información del sistema y crea un directorio
* en el directorio HOME del usuario.
*/
public class Programa {

        public static void main(String[] args) {
                String cadena;

                String commit 1;

                String commit 2;

                String commit 3;
                /**
                * Crea un mapa con las variables de entorno del sistema
                * y las muestra por pantalla.
                */
                Map<String, String> mapa = System.getenv();
                System.out.println(mapa.toString().replace(", ", String.valueOf('\n')).replaceAll("=", " = "));
                System.out.println("\n\n");

                /**
                * Proporciona las propiedades que la JVM obtiene del SO
                * y las muestra por pantalla.
                */
                Properties propiedades = System.getProperties();
                System.out.println(propiedades.toString().replace(", ", String.valueOf('\n')).replaceAll("=", " = "));
                System.out.println("\n\n");

                /**
                * Dependiendo del SO, determina el carácter delimitador
                * de directorios.
                */
                if (System.getProperty("os.name").equals("Linux")){
                        cadena = "/";
                } else {
                        cadena = "\\";
                }

                /**
                * Crea un directorio en el HOME del usuario
                * e indica si la operación ha sido correcta o no.
                */
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