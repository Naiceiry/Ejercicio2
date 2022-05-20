import principal.java.fichero;
import java.util.ArrayList;
import java.io.IOException;
import principal.java.*;

public class main {
    public static void main(String[] args) throws IOException {
        fichero f = new fichero();                 //Crea un Objeto File asociado al fichero personas.dat que se encuentra en el directorio ficheros dentro del directorio actual
        ArrayList<Persona> listaPersonas = f.muestraContenido("personas.txt"); //  crea un array llamado listapersonas y le asigna
    }                                                                                 //el fichero f a una funcion  que le pasa el archivo a leer como parametro
}
