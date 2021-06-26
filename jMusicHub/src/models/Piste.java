package models;

public class Piste {

	private int idPiste;
	private String titrePiste;
	private int dureePiste;
	private String contenuPiste;
	
	public Piste() {
    }
    
	public Piste(int idPiste, String titrePiste, int dureePiste, String contenuPiste) {
		this.idPiste = idPiste;
		this.titrePiste = titrePiste;
		this.dureePiste = dureePiste;
		this.contenuPiste = contenuPiste;
	}

	public int getIdPiste() {
		return idPiste;
	}

	public void setIdPiste(int idPiste) {
		this.idPiste = idPiste;
	}

	public String getTitrePiste() {
		return titrePiste;
	}

	public void setTitrePiste(String titrePiste) {
		this.titrePiste = titrePiste;
	}

	public int getDureePiste() {
		return dureePiste;
	}

	public void setDureePiste(int dureePiste) {
		this.dureePiste = dureePiste;
	}

	public String getContenuPiste() {
		return contenuPiste;
	}

	public void setContenuPiste(String contenuPiste) {
		this.contenuPiste = contenuPiste;
	}
}
