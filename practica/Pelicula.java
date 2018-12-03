package src.practica;

import java.util.Arrays;

public class Pelicula extends Fichero {

	//ATRIBUTOS
	String director;
	String [] actoresPrincipales;
	
	//GETTERS Y SETTERS
	
	
	String getDirector() {
		return director;
	}

	void setDirector(String director) {
		this.director = director;
	}

	String[] getActoresPrincipales() {
		return actoresPrincipales;
	}

	void setActoresPrincipales(String[] actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}


	//CONSTRUCTORES
	Pelicula(int id, String titulo, int size) {
		super(id, titulo, size);
		
	}
	
	Pelicula (int id, String titulo, int size, String director, String [] actoresPrincipales) {
		this(id, titulo, size);
		this.director=director;
		this.actoresPrincipales = actoresPrincipales;
	
	}

	
	
	//METODOS
	
	@Override
	public double tiempoDescarga(double velocidadDescarga) {
		
		return 0;
	}
	@Override
	public int getSize () {
		return super.getSize();
	}

	@Override
	public String toString() {
		return "El fichero es de tipo Película.\n Su título es: "+ getTitulo()+ 
				" su director es "+ getDirector()+ ", sus actores principales son " 
				+ Arrays.toString(actoresPrincipales) + " con Id " + getId() + ".";
	}
	
	
	
	
}
