package principal.java;

public class Persona {
    String nombre; // definicion de variables
    String poblacion;
    int edad;

    Persona(){ //inicializacion de variables
        this.nombre="";
        this.poblacion="";
        this.edad=0;
    }
    Persona(String _nombre, String _poblacion, int _edad){
        this.nombre = _nombre;
        if (_poblacion.equals(""))
            this.poblacion = "Desconocido";
        else
            this.poblacion = _poblacion;
        this.edad = _edad;
    }



    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
