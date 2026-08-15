package clases_POO;

	import javax.swing.JOptionPane;

	public class Aplicacion {

	    public static void main(String[] args) {

	        Entidad cancha = new Entidad();

	        double ladoA = Double.parseDouble(
	                JOptionPane.showInputDialog("Ingrese el lado A:")
	        );

	        double ladoB = Double.parseDouble(
	                JOptionPane.showInputDialog("Ingrese el lado B:")
	        );

	        cancha.setLadoA(ladoA);
	        cancha.setLadoB(ladoB);

	        double area = cancha.calcularArea();

	        JOptionPane.showMessageDialog(
	                null,
	                "El área de la cancha es: " + area
	        );
	    }
	}