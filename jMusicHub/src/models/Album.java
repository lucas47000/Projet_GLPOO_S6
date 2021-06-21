package models;
	
public class Album {
	
	private int idAlbum;
	private String titreAlbum;
	
	public Album() { //constructeur de la classe album
	}
	
	public Album(int idAlbum, String titreAlbum) {
		this.idAlbum = idAlbum;
		this.titreAlbum = titreAlbum;
	}

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNomAlbum() {
		return titreAlbum;
	}

	public void setNomAlbum(String titreAlbum) {
		this.titreAlbum = titreAlbum;
	}
}
