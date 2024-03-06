package ej1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dni;
		String nombre;
		double saldo;
		double sacar;
		double meter;

		System.out.println("Da el dni de la persona");
		dni = sc.next();
		System.out.println("Da el nombre de la persona");
		nombre = sc.next();
		System.out.println("Da el saldo de la persona");
		saldo = sc.nextDouble();
		System.out.println("Cuanto quiere sacar?");
		sacar = sc.nextDouble();
		System.out.println("Cuanto dinero quiere meter");
		meter = sc.nextDouble();
		CuentaCorriente persona = new CuentaCorriente(dni, nombre, saldo);

		persona.meteDinero(saldo, meter);
		persona.sacarDinero(saldo, sacar);
		persona.mostrarInformacion(saldo, dni, nombre);
		sc.close();
	}
}
