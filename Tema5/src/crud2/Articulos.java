package crud2;

import java.util.Objects;

public class Articulos {
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int Stock;

	public Articulos(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
		if (precioCompra > 0) {
			this.precioVenta = precioVenta;
		}
		if (precioCompra >= 0) {
			Stock = stock;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		if (precioCompra > 0) {
			this.precioVenta = precioVenta;
		}
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		if (precioCompra >= 0) {
			Stock = stock;
		}
	}

	@Override
	public String toString() {
		String cadena = "------------------------------\n";
		cadena += "Gestisimal\n Código=" + codigo;
		cadena += "\n Descripción=" + descripcion;
		cadena += "\n Precio de la compra=" + precioCompra;
		cadena += "\n Precio de la venta=" + precioVenta;
		cadena += "\n Stock=" + Stock;
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;

		Articulos art = (Articulos) obj;

		if (art.codigo == this.codigo) {
			igual = true;
		}

		return igual;
	}
	
}
