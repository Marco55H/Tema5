package ej4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opc;

		Artículo producto1 = new Artículo("Sartén", 9.3, 2);
		Artículo producto2 = new Artículo("Valla", 13.56, 5);
		Artículo producto3 = new Artículo("Libro", 15, 0);

		System.out.println("Bienvenido");
		do {
			System.out.println("");
			System.out.println("El producto 1 es");
			producto1.imprime();
			System.err.println("-----------------");
			System.out.println("El producto 2 es");
			producto2.imprime();
			System.err.println("-----------------");
			System.out.println("El producto 3 es");
			producto3.imprime();
			System.err.println("-----------------");
			System.out.println();
			System.out.println("Con que producto quieres hacer las acciones");
			opc = sc.nextInt();
		} while (opc < 1 && opc > 3);

		switch (opc) {
		case 1:
			producto1.imprime();
			System.out.println("El percio con IVA es :");
			System.out.println("¿Tienes descuentos?");
			break;
		case 2:
			producto2.imprime();
			break;
		case 3:
			producto3.imprime();
			break;
		}
		sc.close();
	}
}
