package clases_POO;

public class Entidad {

    private double ladoA;
    private double ladoB;

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }
}
