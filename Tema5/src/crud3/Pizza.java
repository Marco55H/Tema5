package crud3;

public class Pizza {
	/**
	 * Atributo para el código de la pizza
	 */
	private int codigo;
	/**
	 * Atributo para el tamaño de la pizza
	 */
	private String tamanyo;
	/**
	 * Atributo para el tipo de la pizza
	 */
	private String tipo;
	/**
	 * Atributo para el estado de la pizza
	 */
	private String estado = "Pedido";

	/**
	 * Constructor con todos los parametros menos el estado
	 * 
	 * @param codigo  parámentro para el código de la pizza
	 * @param tamanyo parámentro para el tamaño de la pizza
	 * @param tipo    parámentro para el tipo de la pizza
	 */
	public Pizza(int codigo, String tamanyo, String tipo) {
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (tamanyo != null && !tamanyo.equals("") && (tamanyo.equals("familiar") || (tamanyo.equals("mediana")))) {
			this.tamanyo = tamanyo;
		}
		if (tamanyo != null && !tamanyo.equals("")) {
			this.tipo = tipo;
		}
	}

	
	/**
	 * Constructor sin parametros
	 */
	public Pizza() {
		super();
	}

	
	/**
	 * Para coger el valor del codigo
	 * 
	 * @return devolvemos el valor del atriburo codigo
	 */
	public int getCodigo() {
		return this.codigo;
	}

	
	/**
	 * Para coger el valor del tamaño
	 * 
	 * @return devolvemos el valor del atriburo tamaño
	 */
	public String getTamanyo() {
		return this.tamanyo;
	}

	
	/**
	 * Para darle un nuevo valor al tamaño de la pizza
	 * 
	 * @param tamanyo metemos el nuevo parametro del tamaño
	 */
	public void setTamanyo(String tamanyo) {
		if (tamanyo != null && !tamanyo.equals("") && (tamanyo.equals("familiar") || (tamanyo.equals("mediana")))) {
			this.tamanyo = tamanyo;
		}
	}

	
	/**
	 * Para coger el valor del tipo
	 * 
	 * @return devolvemos el valor del atriburo tipo
	 */
	public String getTipo() {
		return this.tipo;
	}

	
	/**
	 * Para darle un nuevo valor al tipo de la pizza
	 * 
	 * @param tipo metemos el nuevo parametro del tipo
	 */
	public void setTipo(String tipo) {
		if (tamanyo != null && !tamanyo.equals("")) {
			this.tipo = tipo;
		}
	}

	
	/**
	 * Para coger el valor del codigo
	 * 
	 * @return devolvemos el valor del atriburo codigo
	 */
	public String getEstado() {
		return this.estado;
	}

	
	/**
	 * Para darle un nuevo valor al estado de la pizza
	 * 
	 * @param estado metemos el nuevo parametro del estado
	 */
	public void setEstado(String estado) {
		if (estado != null && !estado.equals("") && (estado.equals("Pedida")||estado.equals("Servida"))) {
			this.estado = estado;
		}
	}


	@Override
	public String toString() {
		String cadena="-----PIZZAS-----";
		cadena+="------------------------";
		cadena+="Pizzas codigo=" + codigo;
		cadena+="\n tamanyo=" + tamanyo;
		cadena+="\n tipo=" + tipo;
		cadena+="\\n estado=" + estado;
		cadena+="----------------";
		return cadena;
	}
	
	
	public boolean equals(Object o) {
		boolean res=false;
		
		Pizza p2 = (Pizza) o;
		
		if(this.codigo == p2.codigo) {
			res = true;
		}
		
		return res;
	}
	
	

}
