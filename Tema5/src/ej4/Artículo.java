package ej4;

public class Artículo {
	private String nombre;
	// (sin IVA)
	private double precio;
	// (siempre será 21)
	public final int IVA = 21 / 100;
	// (representa cuántos quedan en el almacén)
	private int cuantosQuedan;

	public Artículo(String nombre, double precio, int cuantosQuedan) {
		super();
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public void imprime() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Precio: " + this.precio);
		System.out.println("Cuantos quedan: " + this.cuantosQuedan);
		System.out.println("IVA = 21%");
	}

	public double getPVP() {
		double PVP;
		PVP = this.precio * this.IVA;
		return PVP;
	}

	public double getPVPDescuento(double descuento) {
		double PVPDescuento;
		PVPDescuento = this.precio + this.precio * descuento / 100;
		return PVPDescuento;
	}

	public boolean vender(int cantidad) {
		boolean posible = true;
		if (cantidad > this.cuantosQuedan) {
			posible = false;
		} else {
			this.cuantosQuedan -= cantidad;
		}
		return posible;
	}

	public void almacenar(int almacenar) {
		this.cuantosQuedan += almacenar;
	}
}
