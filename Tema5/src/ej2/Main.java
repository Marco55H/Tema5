package ej2;

import java.util.Scanner;

import ej1.CuentaCorriente;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String titulo = "Libro chulo";
		String autor = "Marco";
		String devolver;
		String pedir;

		System.out.println("Titulo: Libro chulo");
		System.out.println("Autor: Marco");
		autor = sc.next();
		System.out.println("Quieres devolver?");
		devolver = sc.next();
		System.out.println("Quieres pedir?");
		pedir = sc.next();
	
		Libro P1 = new Libro(titulo, autor, 3, 0);
		
		sc.close();
	}
}
