package crud1;

public class Alumno {
	private String nombre;
	private double notaMedia;

	public Alumno(String nombre, double notaMedia) {
		super();
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	public Alumno() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}

}
