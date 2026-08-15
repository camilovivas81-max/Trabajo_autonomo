package Herencia;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.marca = "Toyota";
        carro.setNumeroPuertas(4);

        carro.mostrarInformacion();
    }
}

