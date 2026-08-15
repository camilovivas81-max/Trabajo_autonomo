package Herencia;

public class Carro extends Vehiculo {

    private int numeroPuertas;

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Puertas: " + numeroPuertas);
    }
}

