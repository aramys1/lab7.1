package Laboratorio7.Excepciones;

public class ExcepcionDeNombre extends Exception {
    public ExcepcionDeNombre() {
        super("Error, el nombre no puede contener numeros o caracteres especiales");
    }
}
