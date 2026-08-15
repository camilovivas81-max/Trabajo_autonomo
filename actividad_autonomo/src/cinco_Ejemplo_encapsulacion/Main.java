package cinco_Ejemplo_encapsulacion;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Juan");
        persona.setEdad(17);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
