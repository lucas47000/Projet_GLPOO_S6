package models;

public class Artiste {
	
	private int idArtiste;
	private String nomArtiste;
	
	public Artiste() {
	}

	public Artiste(int idArtiste, String nomArtiste) {
		this.idArtiste = idArtiste;
		this.nomArtiste = nomArtiste;
	}

	public int getIdArtiste() {
		return idArtiste;
	}

	public void setIdArtiste(int idArtiste) {
		this.idArtiste = idArtiste;
	}

	public String getNomArtiste() {
		return nomArtiste;
	}

	public void setNomArtiste(String nomArtiste) {
		this.nomArtiste = nomArtiste;
	}
}
