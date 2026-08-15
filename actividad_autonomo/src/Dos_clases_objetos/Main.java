package Dos_clases_objetos;

public class Main {

    public static void main(String[] args) {


        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 17;


        Persona persona2 = new Persona();
        persona2.nombre = "Carlos";
        persona2.edad = 18;


        Persona persona3 = new Persona();
        persona3.nombre = "Andres";
        persona3.edad = 20;


        persona1.saludar();
        persona1.mostrarEdad();

        persona2.saludar();
        persona2.mostrarEdad();

        persona3.saludar();
        persona3.mostrarEdad();
    }
}