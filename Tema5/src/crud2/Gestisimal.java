package crud2;

public class Gestisimal {

	public static Gestisimal[] array =new Gestisimal[20];
	
	public static void listado(){
		int i=0;
		
		while (i<array.length&&array[i]!=null) {
			System.out.println(array[i].toString());
			i++;
		}
	}
	
	
	public static boolean alta(Gestisimal art) {
		boolean anyadido = false;
		
		// 1º Comprobar si el artículo ya existe
		int i = 0;
		boolean enc = buscaArticulo(art);

		// Si no he encontrado el artículo lo tengo que añadir
		if(!enc) {
			
			while(i<array.length && array[i]!=null) {
				i++;
			}
			
			if(i<array.length) {
				array[i] = art;
				anyadido = true;
			}
		}
		
		return anyadido;
	}
	
	private static boolean buscaArticulo(Gestisimal art) {
		int i = 0;
		boolean enc = false;

		while (i < array.length && !enc) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (array[i] != null && array[i].equals(art)) {
				enc = true;
			}

			i++;
		}
		
		return enc;
	}

}
