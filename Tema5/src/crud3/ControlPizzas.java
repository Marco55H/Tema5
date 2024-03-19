package crud3;

public class ControlPizzas {

	public static Pizza[] arrayPizza = new Pizza[50];

	
	public static int buscaPizza(Pizza p) {
		int pos = -1;
		int i = 0;

		while (i < arrayPizza.length && pos == -1) {
			if (p.equals(arrayPizza[i])) {
				pos = i;
			}
			i++;
		}

		return pos;
	}

	
	
	public static void listado() {

		int i = 0;
	
		
		while (i < arrayPizza.length) {
			if ((arrayPizza[i] != null)) {
				System.out.println(arrayPizza[i]);
			}
			i++;
		}
	}

	public static boolean nuevoPedido(Pizza p) {

		int i = 0;
		int pos = buscaPizza(p);
		boolean anyadido = false;
		while (i < arrayPizza.length && arrayPizza[i]!=null) {
			if (pos==-1) {
				arrayPizza[i]=p;
				anyadido = true;
			}
			i++;
		}
		return anyadido;
	}
	
	
}
