package src.practica;

public class Musica extends Fichero {

	//ATRIBUTOS
	String artista;

	//GETTERS Y SETTERS
	
	String getArtista() {
		return artista;
	}

	void setArtista(String artista) {
		this.artista = artista;
	}

	//CONSTRUCTOR
	
	Musica(int id, String titulo, int size, String artista) {
		super(id, titulo, size);
		this.artista = artista;
	}

	//METODOS
	
	@Override
	
	public int getSize() {
		return super.getSize();
	}
	
	
	@Override
	public String toString() {
		return "El fichero es de tipo Musica.\n Su título es: "+ getTitulo()+ 
				" y su cantante es " + getArtista() + " con Id " + getId() + ".\n";
	}
	
		
	
}
