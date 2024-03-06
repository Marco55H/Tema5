package ej1;

public class CuentaCorriente {
	String dni;
	String nombre;
	double saldo;

	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		if (dni != null && !dni.equals("") && dni.length() == 9)
			this.dni = dni;
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		if (saldo > 0)
			this.saldo = saldo;
	}

	public CuentaCorriente(String dni, double saldo) {
		super();
		if (saldo > 0)
			this.saldo = saldo;
		if (dni != null && !dni.equals("") && dni.length() == 9)
			this.dni = dni;
	}

	public void sacarDinero(double saldo, double sacar) {

		if (sacar <= this.saldo) {

			this.saldo -= sacar;
		}
	}

	public void meteDinero(double saldo, double meter) {
		if (meter > 0)
			;
		this.saldo += meter;

	}

	public void mostrarInformacion(double saldo, String dni, String nombre) {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Saldo: " + this.saldo);
	}
}
