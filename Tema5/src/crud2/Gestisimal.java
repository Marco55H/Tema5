package crud2;

public class Gestisimal {
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int Stock;

	public Gestisimal(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
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
		String cadena="------------------------------\n";
		cadena+="Gestisimal\n Código=" + codigo;
		cadena+="\n Descripción=" + descripcion;
		cadena+="\n Precio de la compra=" + precioCompra;
		cadena+="\n Precio de la venta=" + precioVenta;
		cadena+="\n Stock=" + Stock;
		return cadena;
	}

	
	
}
