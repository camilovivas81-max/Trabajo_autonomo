package Ejercicio_encapsulacion;

import javax.swing.filechooser.FileSystemView;

public class Empleado {

	private String nombre;
	private double salario;
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		setSalario(salario);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		} else {
			System.out.println("salariodebe ser positivo.");
		}
	}
	
	public void mostrarinfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario: " + salario);
	}
}
