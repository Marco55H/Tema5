package crud1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		String nombre;
		Double nota;
		do {
			menu();
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("El listado es: ");
				break;
			case 2:
				System.out.println("Introduce los datos del nuevo alumno ");
				System.out.println("Nombre");
				nombre = sc.nextLine();
				sc.nextLine();
				System.out.println("Nota");
				nota = sc.nextDouble();
				sc.nextLine();
				break;
			case 3:
				System.out.println("¿Qué alumno quiere modificar? ");
				nombre = sc.nextLine();
				sc.nextLine();
				System.out.println("¿Qué nota tiene ahora? ");
				nota = sc.nextDouble();
				sc.nextLine();
				break;
			case 4:
				System.out.println("¿Qué alumno quiere borrar? ");
				nombre = sc.nextLine();
				sc.nextLine();
				break;
			}
		} while (opc != 5);
	}

	public static void menu() {
		System.out.println(" ALUMNOS ");
		System.out.println("========== ");
		System.out.println();
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.println(" Elige opción");
	}
}
