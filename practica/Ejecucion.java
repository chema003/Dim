package src.practica;

import java.util.ArrayList;
import java.util.Collection;

public class Ejecucion {

	//ATRIBUTOS
	static Collection <Fichero> listaDescarga = new ArrayList<>();
	double velocidadConexion = 100;
	int sizeDescarga;
			
	public static void main(String[] args) {
	
	
	//DATOS: HARD CODE
		Musica cancion1 = new Musica(1, "titulo1", 50, "artista1");
		Musica cancion2 = new Musica(2, "titulo2", 100, "artista1");
		Musica cancion3 = new Musica(3, "titulo3", 80, "artista2");
		Musica cancion4 = new Musica(4, "titulo4", 30, "artista3");
		Pelicula pelicula1 = new Pelicula (1, "titulo1", 300);
		Pelicula pelicula2 = new Pelicula (2, "titulo2", 400, "director1", new String [] {"actor1","actor2"});
		Pelicula pelicula3 = new Pelicula(3, "titulo3", 670, "director3", new String [] {"actor4", "actor8", "actor6"});
		Pelicula pelicula4 = new Pelicula (4, "titulo4", 900);
		
		incluirADescarga(cancion1);
		incluirADescarga(pelicula4);
		imprimirInforme();
		
		
		
	}
		
	
	public static void incluirADescarga (Fichero fichero) {
		listaDescarga.add(fichero);
		
	}

	public static void imprimirInforme() {
		
		for (int i=0; i<listaDescarga.length; i++) {
			
			
		}
		
	
		}
	

	
	
	
}

