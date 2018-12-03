package src.practica;

public abstract class Fichero implements Descargable {

	//ATRIBUTOS
	int id;
	String titulo;
	int size;
	
	//GETTERS Y SETTERS
	
	public int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getTitulo() {
		return titulo;
	}
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getSize() {
		return size;
	}
	void setSize(int size) {
		this.size = size;
	}
	
	
	
	//CONSTRUCTOR
	
	Fichero(int id, String titulo, int size) {
		this.id = id;
		this.titulo = titulo;
		this.size = size;
	}
	
	public double tiempoDescarga(double velocidadDescarga) {
		double tiempo;
		tiempo = size/velocidadDescarga;
		return tiempo;
	}
}
