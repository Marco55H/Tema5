package crud1;

public class AlumnoArray {

	public String Alumno[] alumnos = new String[30];
	
	public static void Listado() {
		int i = 0;
		while(i<alumnos.lenght && alumnos[i]!=null) {
			System.out.println(alumnos[i]);
			i++;
		}
	}
	
	public static boolean Nuevo(String nombre,double nota ) {
		boolean nuevo =true;
		int i = 0;
		while(i<alumnos.lenght && alumnos[i]!=null) {
			i++;
		}
		
		if(i<alumnos.lenght) {
			alumnos[i]=nombre, nota;
		}else {
			nuevo=false;
		}
		return nuevo;
	}
	
	
	public static boolean Modificar(String nombre,double nota ) {
		int i = 0;
		boolean modifica = true;
		while(i<alumnos.lenght && alumnos[i]!=null|| alumnos[i].equals(nombre)) {
			i++;
		}
		
		if(i<alumnos.lenght) {
			alumnos[i]=nota;
		}else {
			modifica=false;
		}
		return modifica;
	}
	
	public static boolean Borrar(String nombre,double nota ) {
		int i = 0;
		boolean borrar = true;
		while(i<alumnos.lenght && alumnos[i]!=null|| alumnos[i].equals(nombre)) {
			i++;
		}
		
		if(i<alumnos.lenght) {
			alumnos[i]=null;
		}else {
			borrar=false;
		}
		return borrar;
	}
}
