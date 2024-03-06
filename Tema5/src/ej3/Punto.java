package ej3;
public class Punto {
	private int ejeX;
	private int ejeY;
	public Punto(int ejeX, int ejeY) {
		super();
		this.ejeX = ejeX;
		this.ejeY = ejeY;
	}
	public void imprime() {
		System.out.println("Eje x = " + this.ejeX);
		System.out.println("Eje y = " + this.ejeY);
	}
	public void setXY(int nuevoX, int nuevoY) {
		this.ejeX = nuevoX;
		this.ejeY = nuevoY;
	}
	public void desplaza(int xDesplazado, int yDesplazado) {
		this.ejeX += xDesplazado;
		this.ejeY += yDesplazado;
	}
	public void objeto(int xObjeto, int yObjeto) {
		this.ejeX -= xObjeto;
		this.ejeY -= yObjeto;
	}
	public int getEjeX() {
		return ejeX;
	}
	public void setEjeX(int ejeX) {
		this.ejeX = ejeX;
	}
	public int getEjeY() {
		return ejeY;
	}
	public void setEjeY(int ejeY) {
		this.ejeY = ejeY;
	}
	
	
}


