package Dos_clases_objetos;

public class Persona {


    String nombre;
    int edad;

  
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void mostrarEdad() {
        System.out.println("Tengo " + edad + " años");
    }
}