package Colecciones;

public class fruta {

	/// ATRIBUTOS///
	public String nombre;
	public double precio;
	public int unidades=0;

	/// CONSTRUCTOR///
	public fruta(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidades=0;
	}
	
	///GETTERS Y SETTERS///
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUnidades() {
		return unidades;
	}
	
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}
	
	///METODOS FUNCIONALES DE FRUTA///

	public double getPrecioTotal() {
		return precio*unidades;
	}
}
