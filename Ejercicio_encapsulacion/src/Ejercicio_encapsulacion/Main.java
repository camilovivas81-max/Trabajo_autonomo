package Ejercicio_encapsulacion;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	
	listaEmpleados.add(new Empleado("Juan Pérez",3000.0));
	listaEmpleados.add(new Empleado("Carlos Ruiz",3500.0));
	listaEmpleados.add(new Empleado("Ana Gomez",4000.0));
	
	
	for (Empleado emp : listaEmpleados) {
		emp.mostrarinfo();
		System.out.println("---------------");
	}
	listaEmpleados.get(1).setSalario(3700.0);
	
	System.out.println("Informar actualizada del segundo empleado:");
	listaEmpleados.get(1).mostrarinfo();
	
	listaEmpleados.remove(0);
	
		System.out.println("\nLista de empleados");
		for(Empleado emp : listaEmpleados) {
		emp.mostrarinfo();
		System.out.println("-------------");
		}
	}
}
	
