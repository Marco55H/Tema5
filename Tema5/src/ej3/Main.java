package ej3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ejeX;
		int ejeY;
		int otroX;
		int otroY;
		int opc;
		System.out.println("Que valores quieres para tu tabla");
		System.out.println("La X: ");
		ejeX = sc.nextInt();
		System.out.println("La Y: ");
		ejeY = sc.nextInt();
		Punto coords = new Punto(ejeX, ejeY);
		coords.imprime();
		do {
			System.out.println("Que quieres hacer :");
			System.out.println("1. Nuevas coordenadas");
			System.out.println("2. Desplazar coordenadas");
			System.out.println("3. Coomparar coordenadas con las de un objeto");
			opc = sc.nextInt();
		} while (opc <= 1 && opc >= 3);
		switch (opc) {
		case 1:
			System.out.println("Elige las nuevas coordenadas");
			System.out.println("La X: ");
			otroX = sc.nextInt();
			System.out.println("La Y: ");
			otroY = sc.nextInt();
			coords.setXY(otroX, otroY);
			coords.imprime();
			break;
		case 2:
			System.out.println("Elige cuanto quieres desplazar las coordenadas");
			System.out.println("La X: ");
			otroX = sc.nextInt();
			System.out.println("La Y: ");
			otroY = sc.nextInt();
			coords.desplaza(otroX, otroY);
			coords.imprime();
			break;
		case 3:
			System.out.println("Elige las coordenadas del objeto");
			System.out.println("La X: ");
			otroX = sc.nextInt();
			System.out.println("La Y: ");
			otroY = sc.nextInt();
			coords.objeto(otroX, otroY);
			coords.imprime();
			break;
		}
		sc.close();
	}
}
