package crud1;

public class AlumnoArray {

	public static Alumno[] alumnos = new Alumno[30];

	public static void listado() {
		int i = 0;
		while (i < alumnos.length && alumnos[i] != null) {
			System.out.println(alumnos[i]);
			i++;
		}
	}

	public static boolean nuevo(String nombre, double nota) {
		boolean nuevo = true;
		int pos = 0;
		int i =0;
		pos = encuentraAlumno(nombre);

		if (pos == -1) {
			while(i<alumnos.length && alumnos[i]!=null) {
				i++;
			}
			alumnos[i] = new Alumno(nombre, nota);

		} else {
			nuevo = false;
		}
		return nuevo;
	}

	public static boolean modificar(String nombre, double nota) {
		int pos = 0;
		boolean modifica = true;

		pos = encuentraAlumno(nombre);

		if (pos >= 0) {
			alumnos[pos].setNotaMedia(nota);
		} else {
			modifica = false;
		}
		return modifica;
	}

	public static boolean borrar(String nombre) {
		int pos = 0;
		boolean borrar = true;

		pos = encuentraAlumno(nombre);

		if (pos >= 0) {
			alumnos[pos] = null;
		} else {
			borrar = false;
		}
		return borrar;
	}

	private static int encuentraAlumno(String nombre) {
		int pos = 0;
		while (pos < alumnos.length && (alumnos[pos] == null || !alumnos[pos].getNombre().equals(nombre))) {
			pos++;
		}
		if (pos == alumnos.length) {
			pos = -1;
		}
		return pos;
	}
}
