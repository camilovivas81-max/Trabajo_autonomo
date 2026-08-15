package una_sin_metodos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double ladoA = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado A:")
        );

        double ladoB = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado B:")
        );

        double area = ladoA * ladoB;

        JOptionPane.showMessageDialog(
                null,
                "El área de la cancha es: " + area
        );
    }
}