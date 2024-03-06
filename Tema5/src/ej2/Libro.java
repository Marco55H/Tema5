package ej2;

public class Libro {
	String titulo;
	String autor;
	int numEjemplares;
	int ejemplaresPrestados;

	public Libro(String titulo, String autor, int numEjemplares, int ejemplaresPrestados) {
		super();
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		this.numEjemplares = numEjemplares;

		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public Libro() {
		super();
	}
	
	public boolean prestamo(int numEjemplares, int ejemplaresPrestados) {
		boolean pide=false;
		
		if(this.numEjemplares>=1) {
			pide=true;
		}
		
		this.ejemplaresPrestados+=1;
		this.numEjemplares-=1;
		
		return pide;
	}

	public boolean devolucion(int numEjemplares, int ejemplaresPrestados) {
		boolean devuelve=false;
		
		if(this.ejemplaresPrestados>0) {
			devuelve=true;
		}
		
		this.ejemplaresPrestados-=1;
		this.numEjemplares+=1;
		
		return devuelve;
	}
}
