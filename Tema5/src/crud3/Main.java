package crud3;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		String tipo;
		String tamanyo;
		int codigo;
		
		menu();
		opc = sc.nextInt();
		sc.nextLine();

		do {
			switch (opc) {
			case 1:
				System.out.println("Tus pizzas son: ");
				ControlPizzas.listado();
				break;
			case 2:
				System.out.println("Añade tu pizza");
				
					System.out.println("-------Nueva PIZZA-------");
					System.out.println("Código");
					codigo=sc.nextInt();
					sc.nextLine();
					
					System.out.println("Tamaño");
					tamanyo=sc.nextLine();
					
					System.out.println("Tipo");
					tipo=sc.nextLine();
					
					Pizza p =new Pizza(codigo, tamanyo, tipo);
				ControlPizzas.nuevoPedido(p);
				break;
				
			case 3:
				System.out.println("Que pizza has servido");
				
				System.out.println("Código de la pizza que se ha servido");
				codigo=sc.nextInt();
				sc.nextLine();
				tamanyo=sc.nextLine();
				
				Pizza.setEstado(codigo);
				break;
			}
		} while (opc < 4);
		
		System.out.println("Gracias por usar el programa");
		
		sc.close();
	}

	private static void menu() {
		System.out.println("-------MENÚ-------");
		System.out.println("1º Listado de pizzas");
		System.out.println("2º Nuevo pedido");
		System.out.println("3º Pizzas servidas");
		System.out.println("4º SALIDA");
		System.out.println("Elige tu opción");
	}

}
